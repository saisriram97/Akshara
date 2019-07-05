package com.akshara.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession sess = req.getSession();
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		if(name.equals("hr")&&pass.equals("hr")) {
			resp.sendRedirect("AdminHome.jsp");
		}else {
			resp.sendRedirect("Login.jsp");
			sess.setAttribute("login_result","Invalid Credentials" );
		}
	}

}
