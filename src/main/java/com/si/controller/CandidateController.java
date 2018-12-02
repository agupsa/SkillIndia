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
import com.si.service.CandidateRegServiceInterface;
/**
 * 
 * @author GR5 LTI
 * Controller to handle Candidate Requests
 *
 */
@Controller
public class CandidateController {

	
	@Autowired
	CandidateRegServiceInterface cs;

	
	@RequestMapping(value = "/registerCandidate", method = RequestMethod.POST)
	public ModelAndView candidateRegister(@RequestParam("files") MultipartFile[] files, @ModelAttribute Candidate cr) {
		System.out.println(cr.getName());
		cs.registerCandidate(cr,files);
		
		
		return new ModelAndView("index","msg","Successfully Registered");
	}


}
