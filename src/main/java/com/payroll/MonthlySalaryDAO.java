package com.payroll;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.payroll.util.ConnectionUtil;

public class MonthlySalaryDAO {
	public static String monthlySalary(int emp_id, int month, int year, int no_of_days, int leave_days, int salary,
			String status) {
		Connection con = ConnectionUtil.getConnection();
		System.out.println(con);
 
		String query = "INSERT into employee_salary_payRoll(emp_id,month,year,no_of_days,leave_days,salary,status)VALUES(?,?,?,?,?,?,?)";
		String result = null;
		try {
			PreparedStatement pst = con.prepareStatement(query);
		
			pst.setInt(1, emp_id);
			pst.setInt(2, month);
			pst.setInt(3, year);
			pst.setInt(4, no_of_days);
			pst.setInt(5, leave_days);
			pst.setInt(6, salary);
			pst.setString(7, status);
			int rs1 = pst.executeUpdate();
			if (rs1 == 1) {

				System.out.println("successfully registered");
			}

		} catch (Exception e) {
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}

}
