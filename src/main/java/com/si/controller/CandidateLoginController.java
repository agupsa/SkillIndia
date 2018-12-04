package com.si.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Candidate;
import com.si.model.DisplayRecordModel;
import com.si.model.Login;
import com.si.service.CandidateLoginService;
import com.si.service.EnterCourseService;

/**
 * 
 * @author GR5 LTI Controller to handle candidate requests after login 1. Login
 *         2. Accept or Reject Offer 3. View Application Status
 *
 */

@Controller
public class CandidateLoginController {
	@Autowired
	CandidateLoginService cls;
	@Autowired
	EnterCourseService ecservice;

	/*
	 * Method validates login requests and shows candidate application status if
	 * they have applied to any apprenticeship
	 *
	 */
	@RequestMapping(value = "/candidatelogin", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView login(@ModelAttribute("login") Login login, HttpSession ses) {
		ModelAndView mv = new ModelAndView("CandidateDash");
		Candidate can = (Candidate) ses.getAttribute("can");
		if (can == null) {
			try {

				System.out.println(login.getPass());
				can = (Candidate) cls.userLoginValidation(login);
				if (can == null) {
					return new ModelAndView("CandidateLogin", "msg", "UserName or Password is wrong");
				}
			} catch (Exception e) {
				return new ModelAndView("error", "exception", e);
			}
		}

		ses.setAttribute("can", can);
		ses.setMaxInactiveInterval(300);
		List<DisplayRecordModel> drm = cls.getDrmForCan(can);
		ses.setAttribute("drm", drm);
		return mv;

	}

	/* Candidate will accept the offer letter */
	@RequestMapping(value = "/accept/{letterNo}", method = RequestMethod.GET)
	public ModelAndView acceptOffer(@PathVariable int letterNo) {
		ecservice.acceptOffer(letterNo);
		return new ModelAndView("redirect:../candidatelogin");
	}

	/* Candidate will not accept the offer letter */
	@RequestMapping(value = "/notaccepted/{letterNo}", method = RequestMethod.GET)
	public ModelAndView rejectOffer(@PathVariable int letterNo) {
		ecservice.rejectOffer(letterNo);
		return new ModelAndView("redirect:../candidatelogin");
	}

}
