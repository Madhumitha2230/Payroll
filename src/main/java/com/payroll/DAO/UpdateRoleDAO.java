package com.payroll.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.payroll.model.User;
import com.payroll.util.ConnectionUtil;

public class UpdateRoleDAO {       
	public static List<User> updateRole() throws Exception {
		List<User> update = new ArrayList<User>();
		Connection con = ConnectionUtil.getConnection();
		System.out.println(con);

		System.out.println("Enter your id and Role");
		try (Scanner sc = new Scanner(System.in)) {
			int id = sc.nextInt();
			String role = sc.next();
			int salary = sc.nextInt();

			String query = "UPDATE employee_role SET role=?,salary=? where emp_id = ?";

			try {
				PreparedStatement pst = con.prepareStatement(query);
				pst.setString(1, role);
				pst.setInt(3, id);
				pst.setInt(2, salary);
				pst.executeUpdate();
				System.out.println("Updated");

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return update;
	}

}
