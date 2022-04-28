package com.payroll.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.payroll.model.User;
import com.payroll.util.ConnectionUtil;

public class DisplayActiveEmployeesDAO {
	public static List<User> displayActiveEmployees()throws Exception{
		List<User>activeUsers=new ArrayList<User>();
		Connection con=ConnectionUtil.getConnection();
		System.out.println(con);
		String query="SELECT *FROM employees_details where date_of_releiving is null";
		try {
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				int empId = rs.getInt("emp_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				Date dob = rs.getDate("dob");
				String role = rs.getString("role");
				Date dateOfJoining = rs.getDate("date_of_joined");
				Date dateOfReleiving = rs.getDate("date_of_releiving");

				User user = new User();
				user.setName(name);
				user.setEmpId(empId);
				user.setEmail(email);
				user.setPassword(password);
				user.setDob((java.sql.Date) dob);
				user.setRole(role);
				user.setDateOfJoining((java.sql.Date) dateOfJoining);
				user.setDateOfReleiving((java.sql.Date) dateOfReleiving);
				
				activeUsers.add(user);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	return activeUsers;

	}
}
