package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public ModelAndView add(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=======springmvc======");
		String method = "add";
		return new ModelAndView("user","method",method);
	}
	@RequestMapping("/deleteUser")
	public ModelAndView delete(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=======springmvc======");
		String method = "delete";
		return new ModelAndView("user","method",method);
	}
	@RequestMapping("/listUser")
	public ModelAndView list(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=======springmvc======");
		String method = "list";
		return new ModelAndView("user","method",method);
	}
}
