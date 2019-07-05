package com.akshara.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.akshara.bean.StudentBean;
import com.akshara.dao.AdminDAO;



public class AdminController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminDAO admindao = new AdminDAO();
		HttpSession sess  = req.getSession();
		String roll = "";
		String roll2="";
		String trigger = req.getParameter("evmButton");
		if(trigger.equals("ViewStudentDetails")) {
			
			ArrayList<StudentBean> list = admindao.ViewStudentDetails();
            
            req.setAttribute("studentlist",list);
            sess.setAttribute("update_details","");
            RequestDispatcher view=req.getRequestDispatcher("ViewStudentDetails.jsp");
            view.forward(req,resp);    
		}
		
		else if(trigger.equals("AddStudentDetails"))
		{
			String name = req.getParameter("StudentName");
			String rno = req.getParameter("RollNo");
			String fname = req.getParameter("FName");
			String mname = req.getParameter("MName");
			String ano = req.getParameter("Ano");
			String mno = req.getParameter("Mno");
			String cla = req.getParameter("Cla");
			String cas = req.getParameter("Caste");
			StudentBean bean = new StudentBean();
			bean.setAadharNo(ano);
			bean.setCaste(cas);
			bean.setClassName(cla);
			bean.setFatherName(fname);
			bean.setMobileNo(mno);
			bean.setRollNo(rno);
			bean.setMotherName(mname);
			bean.setStudentName(name);
			int status = admindao.insertStudentDetails(bean); 
			if(status==1)
				sess.setAttribute("update_details","student details added successfully");
			else
				sess.setAttribute("update_details","studuent details not added");
			resp.sendRedirect("AdminHome.jsp");
		}
		
		else if(trigger.equals("lkg"))
		{
			ArrayList<StudentBean> list = admindao.getDetails("lkg");
			 req.setAttribute("studentlist",list);
	            RequestDispatcher view=req.getRequestDispatcher("ViewStudentDetails.jsp");
	            view.forward(req,resp);  
		}else if(trigger.equals("ukg"))
		{
			ArrayList<StudentBean> list = admindao.getDetails("ukg");
			 req.setAttribute("studentlist",list);
	            RequestDispatcher view=req.getRequestDispatcher("ViewStudentDetails.jsp");
	            view.forward(req,resp);  
		}else if(trigger.equals("getRoll")) {
			roll=req.getParameter("rollNumber");
			ArrayList<StudentBean> list = admindao.ViewStudentDetails2(roll);
            req.setAttribute("studentlist",list);
            
            RequestDispatcher view=req.getRequestDispatcher("UpdateStudentDetails.jsp");
            view.forward(req,resp); 
		}else if(trigger.equals("UpdateStudentDetails")) {
			String name = req.getParameter("StudentName");
			//String rno = roll;
			String rno = req.getParameter("RollNumber");
			String fname = req.getParameter("FName");
			String mname = req.getParameter("MName");
			String ano = req.getParameter("Ano");
			String mno = req.getParameter("Mno");
			String cla = req.getParameter("Cla");
			String cas = req.getParameter("Caste");
			StudentBean bean = new StudentBean();
			bean.setAadharNo(ano);
			bean.setCaste(cas);
			bean.setClassName(cla);
			bean.setFatherName(fname);
			bean.setMobileNo(mno);
			bean.setRollNo(rno);
			bean.setMotherName(mname);
			bean.setStudentName(name);
			int status = admindao.insertStudentDetails2(bean); 
			if(status==1)
				sess.setAttribute("update_details","student details updated successfully");
			else
				sess.setAttribute("update_details","student details not updated");
			resp.sendRedirect("AdminHome.jsp");
		
		}else if(trigger.equals("getRollDelete")) {
			roll2=req.getParameter("rollNumber2");
			ArrayList<StudentBean> list = admindao.ViewStudentDetails2(roll2);
            req.setAttribute("studentlistdelete",list);
            
            RequestDispatcher view=req.getRequestDispatcher("DeleteStudentDetails.jsp");
            view.forward(req,resp); 
		}
		else if(trigger.equals("Delete")) {
			//String deletroll = String.valueOf(req.getAttribute("deleteRollnumber"));
			
			String a = (String)req.getParameter("haha");
			System.out.println(a);
			int status = admindao.deleteStudentDetails(a);
			if(status==1)
				sess.setAttribute("update_details","student details deleted successfully");
			else
				sess.setAttribute("update_details","studuent details not deleted");
			resp.sendRedirect("AdminHome.jsp");
		}
		
		}

}
