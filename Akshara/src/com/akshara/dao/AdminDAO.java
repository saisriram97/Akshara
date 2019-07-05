package com.akshara.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.akshara.bean.StudentBean;
import com.akshara.util.DBUtil;

public class AdminDAO {

	public ArrayList<StudentBean> ViewStudentDetails() {
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		String query = "Select * from student_table";
		try {
			Connection con = DBUtil.getDBConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				StudentBean temp = new StudentBean();
				temp.setMobileNo(rs.getString("mobile_no"));
				temp.setStudentName(rs.getString("name"));
				temp.setFatherName(rs.getString("fathers_name"));
				temp.setMotherName(rs.getString("mothers_name"));
				temp.setAadharNo(rs.getString("aadhar_no"));
				temp.setRollNo(rs.getString("roll_no"));
				temp.setClassName(rs.getString("class"));
				temp.setCaste(rs.getString("caste"));
				list.add(temp);
			}
			rs.close();
			ps.close();
			con.close();
			
			
			
		}catch(Exception e) {
			System.out.println("Admin DAO: ViewStudentDetails(): "+e);
		}
		return list;
	}

	public ArrayList<StudentBean> getDetails(String str) {
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		String query = "Select * from student_table where class=?";
		try {
			Connection con = DBUtil.getDBConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,str);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				StudentBean temp = new StudentBean();
				temp.setMobileNo(rs.getString("mobile_no"));
				temp.setStudentName(rs.getString("name"));
				temp.setFatherName(rs.getString("fathers_name"));
				temp.setMotherName(rs.getString("mothers_name"));
				temp.setAadharNo(rs.getString("aadhar_no"));
				temp.setRollNo(rs.getString("roll_no"));
				temp.setClassName(rs.getString("class"));
				temp.setCaste(rs.getString("caste"));
				list.add(temp);
			}
			rs.close();
			ps.close();
			con.close();
			
		
		
	}catch(Exception e) {
		System.out.println("Admin DAO: getDetails(): "+e);
	}
		return list;
}

	public int insertStudentDetails(StudentBean bean) {
		String query = "insert into student_table values(?,?,?,?,?,?,?,?)";
		int i =0;
		try {
			Connection con = DBUtil.getDBConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,bean.getRollNo());
			ps.setString(2,bean.getStudentName());
			ps.setString(3,bean.getFatherName());
			ps.setString(4,bean.getMotherName());
			ps.setString(5,bean.getAadharNo());
			ps.setString(6,bean.getMobileNo());
			ps.setString(7,bean.getClassName());
			ps.setString(8,bean.getCaste());
			i = ps.executeUpdate();
			ps.close();
			con.close();
			
		
		
	}catch(Exception e) {
		System.out.println("Admin DAO: insertStudentDetails(): "+e);
	}
		return i;
	}

	public ArrayList<StudentBean> ViewStudentDetails2(String roll) {
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		String query = "Select * from student_table where roll_no=?";
		try {
			Connection con = DBUtil.getDBConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,roll);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				StudentBean temp = new StudentBean();
				temp.setMobileNo(rs.getString("mobile_no"));
				temp.setStudentName(rs.getString("name"));
				temp.setFatherName(rs.getString("fathers_name"));
				temp.setMotherName(rs.getString("mothers_name"));
				temp.setAadharNo(rs.getString("aadhar_no"));
				temp.setRollNo(rs.getString("roll_no"));
				temp.setClassName(rs.getString("class"));
				temp.setCaste(rs.getString("caste"));
				list.add(temp);
			}
			rs.close();
			ps.close();
			con.close();
			
		
		
	}catch(Exception e) {
		System.out.println("Admin DAO: getDetails(): "+e);
	}
		return list;
	}

	public int insertStudentDetails2(StudentBean bean) {
		String query = "update student_table SET name=?,fathers_name=?,mothers_name=? ,aadhar_no=?,mobile_no=?,class=?,caste=? where roll_no=?";
		int i =0;
		try {
			Connection con = DBUtil.getDBConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(8,bean.getRollNo());
			ps.setString(1,bean.getStudentName());
			ps.setString(2,bean.getFatherName());
			ps.setString(3,bean.getMotherName());
			ps.setString(4,bean.getAadharNo());
			ps.setString(5,bean.getMobileNo());
			ps.setString(6,bean.getClassName());
			ps.setString(7,bean.getCaste());
			i = ps.executeUpdate();
			ps.close();
			con.close();
			
		
		
	}catch(Exception e) {
		System.out.println("Admin DAO: updateStudentDetails(): "+e);
	}
		return i;
		
	}

	public int deleteStudentDetails(String deletroll) {
		int i = 0;
		String query = "delete from student_table where roll_no=?";
		try {
			Connection con = DBUtil.getDBConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,deletroll);
			i = ps.executeUpdate();
			con.commit();
			ps.close();
			con.close();
			
		
		
	}catch(Exception e) {
		System.out.println("Admin DAO: deleteStudentDetails(): "+e);
	}
		return i;
	}
}
