package com.bdqn.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeAction {

	@RequestMapping("/noPage")
	public ModelAndView noPage() {
		return new ModelAndView("/noPage");
	}

	@RequestMapping("/errors")
	public ModelAndView errors() {
		return new ModelAndView("/errors");
	}
}
