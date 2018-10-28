package com.qf.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qf.base.BaseServlet;
import com.qf.domain.User;
import com.qf.service.UserService;
import com.qf.utils.MyBeanUtils;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends BaseServlet {
	public String userRegister(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		User user=MyBeanUtils.populate(User.class, request.getParameterMap());
		return "login.jsp";
	}
	public String userLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		User user1=MyBeanUtils.populate(User.class, request.getParameterMap());
		User user2=UserService.
		return "login.jsp";
	}
}
