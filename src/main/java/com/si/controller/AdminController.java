package com.si.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.si.service.AdminLoginServiceInterface;
import com.si.service.AdminVerifyCanServiceInterface;
import com.si.service.AdminVerifyContrServiceInterface;
import com.si.service.AdminVerifyEstServiceInterface;

/**
 * 
 * @author Gr5 LTI Controller to handle Admin module and request
 * 
 * 
 */

// Controller to handle admin request
@Controller
public class AdminController {

	// Login Service

	@Autowired
	AdminLoginServiceInterface alService;

	// Service for handling Candidate data
	@Autowired
	AdminVerifyCanServiceInterface avcService;

	// Service to handle Establishment Data
	@Autowired
	AdminVerifyEstServiceInterface aveService;

	// Service to handle Contract Data
	@Autowired
	AdminVerifyContrServiceInterface avctrService;

	// This method Validates Admin Login
	@RequestMapping("/adminLogin")
	public ModelAndView adminLogin(@ModelAttribute("login") Login login) {
			ModelAndView mv = new ModelAndView("AdminDash");
			boolean o = alService.adminLogin(login);
			if(o==true) {
				mv.addObject("admin", login);
			return mv;}
			else {
				return new ModelAndView("admin","msg","Wrong Username or password");
			}
		

	}

	// This Controller returns the list of Unverified Candidates
	@RequestMapping("/canver")
	public ModelAndView validateCandidate() {
		ModelAndView mv = new ModelAndView("CandidateVerification");
		List<Candidate> uCan = null;
		try {
			uCan = avcService.getUnverifiedCan();
		} catch (Exception e) {
			// TODO logger
			return new ModelAndView("error", "msg", "Error" + e.getMessage());
		}
		if (uCan != null) {
			mv.addObject("uCan", uCan);
			return mv;
		}
		mv.addObject("msg", "No More Requests to process");
		return mv;
	}

	// Method to change status of Candidate based on admin action (Accept/Reject)
	@RequestMapping(value = "/cverify/{canRegNo}/{action}", method = RequestMethod.GET)
	public ModelAndView verifyCandidate(@PathVariable("canRegNo") int canRegno, @PathVariable("action") int action,
			HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("redirect:../../canver");
		int i = 0;
		try {
			i = avcService.setCanVerification(canRegno, action);
		} catch (Exception e) {
			// TODO logger
			mv.addObject("Exception", e);
			return mv;
		}
		if (i > 0) {
			mv.addObject("msg", "Action Succesfull");
		} else {
			mv.addObject("msg", "Action Failed");
		}
		return mv;
	}

	// TODO handle IO exception in jsp
	// View Files Directly on Server without downloading
	@RequestMapping(value = "dispfile/{canRegNo}/{fileId}", method = RequestMethod.GET)
	public void dispFile(HttpServletResponse response, @PathVariable("canRegNo") int canRegNo,
			@PathVariable("fileId") int fileId) throws IOException {
		String fpath = avcService.getFilePath(canRegNo, fileId); // fetches path of file from db
		InputStream in = null;
		File file = new File(fpath); // links file to program
		in = new BufferedInputStream(new FileInputStream(file)); // reads file
		String mimeType = URLConnection.guessContentTypeFromStream(in); // Gets file Type
		response.setContentType(mimeType); // Sets file type of view to be able to display it
		IOUtils.copy(in, response.getOutputStream()); // sends file to view
	}

	// This method returns the list of unverified Establishments
	@RequestMapping("/estver")
	public ModelAndView validateEstablishment() {
		ModelAndView mv = new ModelAndView("EstablishmentVerification");
		List<Establishment> uEst = null;
		try {
			uEst = aveService.getUnverifiedEst();
		} catch (Exception e) {
			// TODO logger
			return new ModelAndView("error", "msg", "Error: " + e.getMessage());
		}
		if (uEst != null) {
			mv.addObject("uEst", uEst);
		} else {
			mv.addObject("msg", "No Establishment for verification");
		}
		return mv;
	}

	// Method to change status of Establishment based on admin action
	// (Accept/Reject)
	@RequestMapping(value = "/everify/{estRegNo}/{action}", method = RequestMethod.GET)
	public ModelAndView verifyEstablishment(@PathVariable("estRegNo") int estRegno, @PathVariable("action") int action,
			HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("redirect:../../estver");
		int i = 0;
		try {
			i = aveService.setEstVerification(estRegno, action);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		if (i > 0) {
			mv.addObject("msg", "Action Succesfull");
		} else {
			mv.addObject("msg", "Action Failed");
		}
		return mv;
	}

	// This method returns the list of contracts for admin approval

	@RequestMapping("/contrver")
	public ModelAndView verifyContract() {
		ModelAndView mv = new ModelAndView("ContractVerification");
		List<Contract> uContr = null;
		try {
			uContr = avctrService.getUnverifiedContr();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ModelAndView("error", "msg", "Error: " + e.getMessage());
		}
		if (uContr != null) {
			mv.addObject("uContr", uContr);
			return mv;
		}
		return new ModelAndView("error", "msg", "No Contract for verification");

	}

	// Method to change status of Contract based on admin action (Accept/Reject)
	@RequestMapping(value = "/coverify/{letterNo}/{action}", method = RequestMethod.GET)
	public ModelAndView verifyContract(@PathVariable("letterNo") int letterNo, @PathVariable("action") int action,
			HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("redirect:../../contrver");
		int i = 0;
		try {
			i = avctrService.setContrVerification(letterNo, action);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		if (i > 0) {
			mv.addObject("msg", "Action Succesfull");
		} else {
			mv.addObject("msg", "Action Failed");
		}
		return mv;
	}

}
