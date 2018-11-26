package com.si.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Establishment;
import com.si.service.EstablishmentRegService;

@Controller
public class EstablishmentController {
	@Autowired
	EstablishmentRegService ers;
	@RequestMapping(value="/registerEstablishment", method=RequestMethod.POST)
	public  ModelAndView candidateRegister(@ModelAttribute("Establishment") Establishment est){
		ers.registerCandidate(est);
		return new ModelAndView("regSuccess");
	}
	
	
}