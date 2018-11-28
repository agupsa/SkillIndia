package com.si.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Candidate;
import com.si.model.Login;
import com.si.service.CandidateLoginService;
import com.si.service.CandidateRegServiceInterface;


@Controller
public class CandidateController {

	@Autowired
	CandidateLoginService cls;

	@Autowired
	CandidateRegServiceInterface cs;

	@RequestMapping(value = "/registerCandidate", method = RequestMethod.POST)
	public ModelAndView candidateRegister(@ModelAttribute("CandidateRegistration") Candidate cr) {
		cs.registerCandidate(cr);
		return new ModelAndView("regSuccess");
	}

	
	@RequestMapping(value = "/candidatelogin", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("login") Login login,HttpSession sess) {
		try {
			ModelAndView mv = new ModelAndView();
			Object o = cls.userLoginValidation(login);
			Candidate can = (Candidate) o;
			System.out.println(can);
			sess.setAttribute("can", can);
			System.out.println("back to controller");
			if (can != null) {
				return new ModelAndView("CandidateDashboard");
			} 
		} catch (Exception e) {
			return new ModelAndView("temp", "exception", e);
		}
		return new ModelAndView("CandidateLogin", "message", "UserName or Password is wrong");
	}

	


}
