package com.si.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Establishment;
import com.si.service.EstablishmentRegService;


/**
 * 
 * @author GR5 LTI
 * Controller to Handle Establishment Requests
 *
 */
@Controller
public class EstablishmentController {
	@Autowired
	EstablishmentRegService ers;
	

	@RequestMapping(value = "/registerEstablishment", method = RequestMethod.POST)
	public ModelAndView EstablishmentRegister(@RequestParam("files") MultipartFile files, @ModelAttribute("Establishment") Establishment est) {
		ers.registerEstablishment(est,files);
		return new ModelAndView("index","msg","suceesfully registered");
	}
	
	

}



