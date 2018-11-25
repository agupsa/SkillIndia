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
import com.si.service.CandidateRegService;
import com.si.dao.CandidateDaoInteface;
import com.si.dao.LoginDaoInterface;

@Controller
public class CandidateController {
	@Autowired
	CandidateDaoInteface cdao;
	@Autowired
	LoginDaoInterface ldao;
	
	@Autowired
	CandidateRegService cs;
	
	@RequestMapping(value="/registerCandidate", method=RequestMethod.POST)
	public  ModelAndView candidateRegister(@ModelAttribute("CandidateRegistration") Candidate cr){
		cs.registerCandidate(cr);
		return new ModelAndView("regSuccess");
	}
	
	@RequestMapping("/loginpage")
	public ModelAndView loginPage() {
		return new ModelAndView("CanLogin");
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("login") Login login){
		try{
			Object o = ldao.validate(login);
			System.out.println("Inside controller");
			HttpSession s = req.getSession(true);
			s.setAttribute("Object", o);
			if(o!=null){
				return new ModelAndView("loginSuccess");
			}
			else{
				s.invalidate();
			}
		}catch(Exception e){
			return new ModelAndView("temp","exception",e);
		}
		return new ModelAndView("login","message","UserName or Password is wrong");
	}
	@RequestMapping(value="/logout")
	public ModelAndView logout(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("login") Login login){
		
		HttpSession s = req.getSession();
		s.invalidate();
		return new ModelAndView("login","message","You have been successfully logged out");
	}
	

}
