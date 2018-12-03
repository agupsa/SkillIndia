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

@Controller
public class CandidateLogin {
	@Autowired
	CandidateLoginService cls;
	@Autowired
	EnterCourseService ecservice;

	@RequestMapping(value = "/candidatelogin", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView login(@ModelAttribute("login") Login login, HttpSession ses) {
		ModelAndView mv = new ModelAndView("CandidateDash");
		Candidate can = (Candidate) ses.getAttribute("can");
		if (can == null) {
			System.out.println("Getting candidate");
			try {

				System.out.println(login.getPass());
				Object o = cls.userLoginValidation(login);
				can = (Candidate) o;
				System.out.println(can);
				
				System.out.println("back to controller");
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
		System.out.println(drm);
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
