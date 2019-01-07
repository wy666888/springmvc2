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

	@RequestMapping(value="/addUser1",method=RequestMethod.POST)
	public String add1(HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		return "/userDetail";
	}
	@RequestMapping("/addUser2")
	public String add2(String username,String age,HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		return "/userDetail";
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
		/*String method = "list";
		requ.setAttribute("method", method);*/
		return "/addUser";
	}
}
