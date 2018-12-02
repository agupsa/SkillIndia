package com.si.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.si.model.Candidate;
import com.si.model.DisplayRecordModel;
import com.si.model.Login;
import com.si.service.CandidateLoginService;

@Controller
@SessionAttributes("can")
public class CandidateLogin {
	@Autowired
	CandidateLoginService cls;

	@RequestMapping(value = "/candidatelogin", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView login(@SessionAttribute("can") Candidate c,	@ModelAttribute("login") Login login) {
		ModelAndView mv = new ModelAndView("CandidateDash");
			try {

				System.out.println(login.getPass());
				Object o = cls.userLoginValidation(login);
				c = (Candidate) o;
				System.out.println(c);
				mv.addObject("can", c);
				System.out.println("back to controller");
				if (c != null) {
					List<DisplayRecordModel> drm = cls.getDrmForCan(c);
					System.out.println(drm);
					mv.addObject("drm", drm);
					return mv;
					
				}else {
					return new ModelAndView("CandidateLogin", "msg", "UserName or Password is wrong");
				}

			} catch (Exception e) {
				return new ModelAndView("error", "exception", e);
			}

	}

}
