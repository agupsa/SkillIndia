package com.si.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Candidate;
import com.si.model.Contract;
import com.si.model.Establishment;
import com.si.model.Login;
import com.si.service.AdminVerifyCanService;
import com.si.service.AdminVerifyContrService;
import com.si.service.AdminVerifyEstService;
import com.si.service.AdminloginService;
/**
 * 
 * @author Gr5 LTI
 * Controller to handle Admin module and request
 * 1. Login service
 *
 */
@Controller
public class AdminController {
	/*
	 * Login Service
	 */
	@Autowired
	AdminloginService alService;
	
	/*
	 * Service for handling Candidate data
	 */
	@Autowired
	AdminVerifyCanService avcService;
	
	/*
	 * Service to handle Establishment Data
	 */
	@Autowired
	AdminVerifyEstService aveService;
	
	/*
	 * Service to handle Contract Data
	 */
	@Autowired
	AdminVerifyContrService avctrService;

	
	@RequestMapping("/adminLogin")
	public ModelAndView adminLogin(@ModelAttribute("login") Login login) {
		try {
			System.out.println(login);
			ModelAndView mv = new ModelAndView("AdminDash");
			boolean o = alService.adminLogin(login);
			System.out.println(o);
			mv.addObject("admin",login);

				System.out.println("Admin logged in");
				return mv;
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println(e);
			return new ModelAndView("error","Exception",e);
		}
		/*System.out.println("wrong");
		return new ModelAndView("admin","msg","Wrong Credentials");
		*/
	}
	@RequestMapping("/canver")
	public ModelAndView validateCandidate() {
		ModelAndView mv = new ModelAndView("CandidateVerification");
		System.out.println("in controller for can verify list");
		List<Candidate> uCan = null;
		try {
			uCan = avcService.getUnverifiedCan();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ModelAndView("error","msg","Error"+e.getMessage());
		}
		if(uCan!=null) {
			mv.addObject("uCan",uCan);
			System.out.println("got unverified Can list");
			return mv;
			}
		return new ModelAndView("error","msg","No candidate for verification");
	}
	
	@RequestMapping(value="/cverify/{canRegNo}/{action}", method=RequestMethod.GET)
	public ModelAndView verifyCandidate(@PathVariable("canRegNo") int canRegno, @PathVariable("action") int action,HttpServletRequest req){
		ModelAndView mv = new ModelAndView("redirect:../../canver");
		System.out.println(canRegno+"\t"+action);
		int i=0;
		try {
			i = avcService.setCanVerification(canRegno, action);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			mv.addObject("msg","Action Succesfull");
		}else {
			mv.addObject("msg", "Action Failed");
		}
		return mv;
	}
	
	
	//TODO handle IO exception in servlet
	//View Files Directly on Server without downloading
	@RequestMapping(value="dispfile/{canRegNo}/{fileId}", method = RequestMethod.GET)
	public void dispFile(HttpServletResponse response , @PathVariable("canRegNo") int canRegNo,@PathVariable("fileId") int fileId) throws IOException {
		//ModelAndView mv = new ModelAndView();
		System.out.println("Getting img");
		String fpath= avcService.getFilePath(canRegNo, fileId);
		InputStream in = null;
		File file = new File(fpath);
		System.out.println("got img");
		in=new BufferedInputStream(new FileInputStream(file));
		String mimeType=URLConnection.guessContentTypeFromStream(in);
		response.setContentType(mimeType);
		IOUtils.copy(in, response.getOutputStream());
		
		
		//return mv;
	}

	@RequestMapping("/estver")
	public ModelAndView validateEstablishment() {
		ModelAndView mv = new ModelAndView("EstablishmentVerification");
		System.out.println("in controller for est verify list");
		List<Establishment> uEst = null;
		try {
			uEst = aveService.getUnverifiedEst();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ModelAndView("error","msg","Error"+e.getMessage());
		}
		if(uEst!=null) {
			mv.addObject("uEst",uEst);
			System.out.println("got unverified Est list");
			return mv;
			}
		return new ModelAndView("error","msg","No Establishment for verification");
	}
	@RequestMapping(value="/everify/{estRegNo}/{action}", method=RequestMethod.GET)
	public ModelAndView verifyEstablishment(@PathVariable("estRegNo") int estRegno, @PathVariable("action") int action,HttpServletRequest req){
		ModelAndView mv = new ModelAndView("redirect:../../estver");
		System.out.println(estRegno+"\t"+action);
		int i=0;
		try {
			i = aveService.setEstVerification(estRegno, action);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			mv.addObject("msg","Action Succesfull");
		}else {
			mv.addObject("msg", "Action Failed");
		}
		return mv;
	}
	
	
	@RequestMapping("/contrver")
	public ModelAndView verifyContract() {
		ModelAndView mv = new ModelAndView("ContractVerification");
		System.out.println("in controller for contract verify list");
		List<Contract> uContr = null;
		try {
			uContr = avctrService.getUnverifiedContr();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ModelAndView("error","msg","Error: "+e.getMessage());
		}
		if(uContr!=null) {
			mv.addObject("uContr",uContr);
			System.out.println("got unverified contract list: " );
			return mv;
			}
		return new ModelAndView("error","msg","No Contract for verification");
		

	}
	@RequestMapping(value="/coverify/{letterNo}/{action}", method=RequestMethod.GET)
	public ModelAndView verifyContract(@PathVariable("letterNo") int letterNo, @PathVariable("action") int action,HttpServletRequest req){
		ModelAndView mv = new ModelAndView("redirect:../../contrver");
		System.out.println(letterNo+"\t"+action);
		int i=0;
		try {
			i = avctrService.setContrVerification(letterNo, action);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			mv.addObject("msg","Action Succesfull");
		}else {
			mv.addObject("msg", "Action Failed");
		}
		return mv;
	}
	
}
