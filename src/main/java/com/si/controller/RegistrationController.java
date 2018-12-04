package com.si.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Candidate;
import com.si.model.Establishment;
import com.si.service.CandidateRegServiceInterface;
import com.si.service.EstablishmentRegService;
/**
 * 
 * @author GR5 LTI
 * Controller to Register users
 *
 */
@Controller
public class RegistrationController {

	//Service to handle Candidate Registration Request
	@Autowired
	CandidateRegServiceInterface cs;

	//Service to handle Establishment Registration Request
	@Autowired
	EstablishmentRegService ers;
	
	// Method That takes Candidate form data and passes it to Dao class to save in database
	@RequestMapping(value = "/registerCandidate", method = RequestMethod.POST)
	public ModelAndView candidateRegister(@RequestParam("files") MultipartFile[] files, @ModelAttribute Candidate cr) {
		cs.registerCandidate(cr,files);
		return new ModelAndView("index","msg","Successfully Registered");
	}


	// Method That takes Establishment form data and passes it to Dao class to save in database
	@RequestMapping(value = "/registerEstablishment", method = RequestMethod.POST)
	public ModelAndView EstablishmentRegister(@RequestParam("files") MultipartFile files, @ModelAttribute("Establishment") Establishment est) {
		ers.registerEstablishment(est,files);
		return new ModelAndView("index","msg","suceesfully registered");
	}
	
	

}
