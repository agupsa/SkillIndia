package com.si.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Login;
import com.si.service.AdminloginService;
/**
 * 
 * @author Gr5 LTI
 * Controller to handle Admin module and request
 * 1. Login service
 *
 */
@Controller
public class AdminController {
	
	@Autowired
	AdminloginService alService;
	
	@RequestMapping("/adminLogin")
	public ModelAndView adminLogin(@ModelAttribute("login") Login login) {
		try {
			System.out.println(login);
			ModelAndView mv = new ModelAndView("AdminDash");
			boolean o = alService.adminLogin(login);
			System.out.println(o);
			mv.addObject("admin",login);

				System.out.println("Admin logged in");
				return mv;
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println(e);
			return new ModelAndView("error","Exception",e);
		}
		/*System.out.println("wrong");
		return new ModelAndView("admin","msg","Wrong Credentials");
		*/
	}

}
