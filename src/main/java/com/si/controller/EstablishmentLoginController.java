package com.si.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
import com.si.service.EnterCourseService;
import com.si.service.EstablishmentLoginService;

@Controller
@SessionAttributes({ "est", "drm" })
public class EstablishmentLoginController {
	@Autowired
	EstablishmentLoginService els;
	@Autowired
	EnterCourseService ecservice;

	@RequestMapping(value = "/establishmentlogin", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView login(@ModelAttribute("login") Login login, HttpSession ses) {
		ModelAndView mv = new ModelAndView("EstablishmentDash");
		Establishment est = (Establishment) ses.getAttribute("est");
		if (est == null) {
			try {
				System.out.println(login.getPass());
				Object o = els.EstablishmentLoginValidation(login);
				est = (Establishment) o;
				System.out.println("Inside controller");
				
				if (est == null) {
					return new ModelAndView("EstablishmentLogin","msg", "UserName or Password is wrong");
					
				} 
			} catch (Exception e) {
				return new ModelAndView("error", "exception", e);
			}
		}
		ses.setAttribute("est", est);
		ses.setMaxInactiveInterval(300);
		List<DisplayRecordModel> drm = els.getDrm(est);
		System.out.println(drm);
		ses.setAttribute("drm", drm);
		return mv;
	}

	// Enter Course controller by establishment
	@RequestMapping(value = "/enterCourse", method = RequestMethod.POST)
	public ModelAndView EstablishmentRegister(@ModelAttribute("course") Course course) {
		ecservice.enterCourse(course);
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
		System.out.println(contract.getStartDate());
		int i = ecservice.checkContractNo(contract);

		System.out.println(i);
		if (i == 1) {
			// if contract present
			ecservice.saveContractDetails(contract);
			return new ModelAndView("redirect:establishmentlogin", "message", "Contract Data saved successfully");
		} else  { // if contract not present
			return new ModelAndView("sendOffer", "message", "Check Contract Number");

		}
	}
	
	@RequestMapping(value="/fillOffer/{letterNo}", method = RequestMethod.GET)
	public ModelAndView fillOffer(@PathVariable int letterNo, HttpSession ses) {
		System.out.println(letterNo);
		ses.setAttribute("letterNo", letterNo);
		return new ModelAndView("redirect:../sendOffer.jsp");
	}

	/* It will reject the candidate application by establishment */
	@RequestMapping(value = "/reject/{letterNo}", method = RequestMethod.GET)
	public ModelAndView rejectApply(@PathVariable int letterNo) {
		ecservice.rejectApply(letterNo);
		return new ModelAndView("redirect:../establishmentlogin");
	}

}
