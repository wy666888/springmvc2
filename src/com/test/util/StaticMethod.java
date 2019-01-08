package com.test.util;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

public class StaticMethod {
	/**将数据封装成json并返回前台（适用于ajax请求）
	 * @param obj
	 * @param response
	 * @throws IOException
	 */
	public static void renderJson(Object obj, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String jsonStr = JSON.toJSONString(obj);
		
		response.setCharacterEncoding("utf-8");
		
		response.getWriter().write(jsonStr);
		
		response.getWriter().close();
	}
}
