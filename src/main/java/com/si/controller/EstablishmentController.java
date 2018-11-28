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

import com.si.model.Establishment;
import com.si.model.Login;
import com.si.service.EstablishmentLoginService;
import com.si.service.EstablishmentRegService;

@Controller
public class EstablishmentController {
	@Autowired
	EstablishmentRegService ers;
	@Autowired
	EstablishmentLoginService els;

	@RequestMapping(value = "/registerEstablishment", method = RequestMethod.POST)
	public ModelAndView EstablishmentRegister(@ModelAttribute("Establishment") Establishment est) {
		ers.registerEstablishment(est);
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/establishmentlogin", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("login") Login login) {
		try {
			Object o = els.EstablishmentLoginValidation(login);
			Establishment est = (Establishment)o;
			System.out.println("Inside controller");
			HttpSession s = req.getSession(true);
			s.setAttribute("est", est);
			if (o != null) {
				return new ModelAndView("EstablishmentDash");
			} else {
				s.invalidate();
			}
		} catch (Exception e) {
			return new ModelAndView("temp", "exception", e);
		}
		return new ModelAndView("EstablishmentLogin", "message", "UserName or Password is wrong");
	}
}


//
