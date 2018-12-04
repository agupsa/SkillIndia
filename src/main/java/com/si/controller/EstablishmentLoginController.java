package com.si.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Contract;
import com.si.model.Course;
import com.si.model.DisplayRecordModel;
import com.si.model.Establishment;
import com.si.model.Login;
import com.si.service.EnterCourseServiceInterface;
import com.si.service.EstablishmentLoginServiceInterface;
import com.si.service.SearchCourseServiceInterface;

/**
 * 
 * @author GR5 LTI
 * Controller That Handles Establishment details after logging in
 *
 */
@Controller
@SessionAttributes({ "est", "drm" })
public class EstablishmentLoginController {
	@Autowired
	EstablishmentLoginServiceInterface elService;
	@Autowired
	EnterCourseServiceInterface ecService;
	@Autowired
	SearchCourseServiceInterface scService;

	//Method to validate Login and return lists of application of candidates
	@RequestMapping(value = "/establishmentlogin", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView login(@ModelAttribute("login") Login login, HttpSession ses) {
		ModelAndView mv = new ModelAndView("EstablishmentDash");
		Establishment est = (Establishment) ses.getAttribute("est");
		if (est == null) {
			try {
				Object o = elService.EstablishmentLoginValidation(login);
				est = (Establishment) o;				
				if (est == null) {
					return new ModelAndView("EstablishmentLogin","msg", "UserName or Password is wrong");
					
				} 
			} catch (Exception e) {
				return new ModelAndView("error", "exception", e);
			}
		}
		ses.setAttribute("est", est);
		ses.setMaxInactiveInterval(300);
		List<DisplayRecordModel> drm = elService.getDrm(est);
		ses.setAttribute("drm", drm);
		return mv;
	}

	// Enter Course controller by establishment
	@RequestMapping(value = "/enterCourse", method = RequestMethod.POST)
	public ModelAndView EstablishmentRegister(@ModelAttribute("course") Course course) {
		ecService.enterCourse(course);
		return new ModelAndView("EstablishmentDash");
	}

	// Enter contract details controller
	@RequestMapping(value = "/sendOffer", method = RequestMethod.POST)
	public ModelAndView courseApply(HttpServletRequest req, HttpServletResponse res,
			@ModelAttribute("contract") Contract contract) {
		/*
		 * Checks if contract number is registered or not If registered enter details
		 * and send to candidate If not error
		 */
		int i = ecService.checkContractNo(contract);
		if (i == 1) {
			// if contract present
			ecService.saveContractDetails(contract);
			return new ModelAndView("redirect:establishmentlogin", "message", "Contract Data saved successfully");
		} else  { // if contract not present
			return new ModelAndView("sendOffer", "msg", "Check Contract Number");

		}
	}
	
	//This method redirects the to new form page adding contract number to session so that user doesn't have to enter it manually
	@RequestMapping(value="/fillOffer/{letterNo}", method = RequestMethod.GET)
	public ModelAndView fillOffer(@PathVariable int letterNo, HttpSession ses) {
		ses.setAttribute("letterNo", letterNo);
		return new ModelAndView("redirect:../sendOffer.jsp");
	}

	/* It will reject the candidate application by establishment */
	@RequestMapping(value = "/reject/{letterNo}", method = RequestMethod.GET)
	public ModelAndView rejectApply(@PathVariable int letterNo) {
		ecService.rejectApply(letterNo);
		return new ModelAndView("redirect:../establishmentlogin");
	}

	// List all courses of the establishment
	@RequestMapping("/listcourses")
	public ModelAndView showAllCourses(HttpSession ses) {
		ModelAndView mv = new ModelAndView("EstCourseDisp");
		Establishment est = (Establishment)ses.getAttribute("est");
		List<Course> cou = scService.getCourseById(est.getEstRegNo());
		ses.setAttribute("courses", cou);
		return mv;
		
	}
}
