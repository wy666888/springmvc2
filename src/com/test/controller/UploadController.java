package com.test.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.test.entity.User;
import com.test.util.StaticMethod;

@Controller
@RequestMapping("/file")
public class UploadController {

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
	
	/**单文件上传模拟
	 * @param file
	 * @param requ
	 * @param resp
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/upload")
	public String upload(@RequestParam("file")CommonsMultipartFile file,HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		String filename = file.getOriginalFilename();
		System.out.println("filename----->"+filename);
		if(!file.isEmpty()) {
			//FileOutputStream os = new FileOutputStream("D:/"+new Date().getTime()+filename);
			//InputStream in = file.getInputStream();
			/*int b = 0;
			while((b=in.read())!=-1) {
				os.write(b);
			}*/
			/*byte[] b = new byte[1024];
			int len = 0;
			while((len=in.read(b))!=-1) {
				os.write(b, 0, len);
			}
			os.flush();
			os.close();
			in.close();*/
			
			String path = "D:/"+new Date().getTime()+filename;
			File localFile = new File(path);
			file.transferTo(localFile);
		}
		return "/success";
	}
	@RequestMapping("/upload2")
	public String upload2(HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		CommonsMultipartResolver resol = new CommonsMultipartResolver(requ.getSession().getServletContext());
		if(resol.isMultipart(requ)) {
			MultipartHttpServletRequest multiRequ = (MultipartHttpServletRequest)requ;
			Iterator<String> iter = multiRequ.getFileNames();
			while(iter.hasNext()) {
				String filename = iter.next();
				MultipartFile file = multiRequ.getFile(filename);
				if(file!=null) {
					String path = "D:/"+new Date().getTime()+file.getOriginalFilename();
					File localFile = new File(path);
					file.transferTo(localFile);
				}
			}
		}
		return "/success";
	}
	@RequestMapping("/toUpload")
	public String toUpload(HttpServletRequest requ, HttpServletResponse resp) throws Exception {
		return "/upload";
	}
}
