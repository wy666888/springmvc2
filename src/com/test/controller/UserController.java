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
	public String add(HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=======springmvc======");
		String method = "add";
		requ.setAttribute("method", method);
		return "/user";
	}
	@RequestMapping("/deleteUser")
	public String delete(HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=======springmvc======");
		String method = "delete";
		requ.setAttribute("method", method);
		return "/user";
	}
	@RequestMapping("/listUser")
	public String list(HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("=======springmvc======");
		String method = "list";
		requ.setAttribute("method", method);
		return "/user";
	}
}
