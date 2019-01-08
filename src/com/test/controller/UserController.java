package com.test.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.test.entity.User;
import com.test.util.StaticMethod;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value="/addUser1",method=RequestMethod.POST)
	public String add1(HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		// 直接使用request能够获取到表单提交的参数，在此可以使用request.getParameter到，前台el表达式使用{param.xx}
		return "/userDetail";
	}
	@RequestMapping("/addUser2")
	public String add2(String username,String age,HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		// 可以将表单的参数按照名称映射到此处
		return "/userDetail";
	}
	@RequestMapping("/addUser3")
	public String add3(User user,HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		// 可以将表单的对象封装成对象映射到此处
		
		requ.setAttribute("user", user);
		return "/userDetail";
	}
	@RequestMapping("/addUser4")
	public void add4(User user,HttpServletRequest requ, HttpServletResponse response) throws Exception {
		// ajax返回json到前台
		
		/*String jsonStr = JSON.toJSONString(user);
		
		response.setCharacterEncoding("utf-8");
		
		response.getWriter().write(jsonStr);
		
		response.getWriter().close();*/
		StaticMethod.renderJson(user,response);
	}
	
	@RequestMapping("/deleteUser")
	public String delete(HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		// 可以向前台传递参数
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
