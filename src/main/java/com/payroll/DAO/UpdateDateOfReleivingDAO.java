package com.payroll.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;

import com.payroll.model.User;
import com.payroll.util.ConnectionUtil;

public class UpdateDateOfReleivingDAO {
	public static List<User> updateDateOfReleiving() throws Exception {
		List<User> update = new ArrayList<User>();
		Connection con = ConnectionUtil.getConnection();
		System.out.println(con);

		System.out.println("Enter your id and Releiving date");
		try (Scanner sc = new Scanner(System.in)) {
			int id = sc.nextInt();
			String dateOfReleiving1 = sc.next(); // YYYY-MM-DD
			LocalDate doR = LocalDate.parse(dateOfReleiving1);
			String query = "UPDATE employees_details SET date_of_releiving=? where emp_id = ?";

			try {
				PreparedStatement pst = con.prepareStatement(query);
				pst.setDate(1, java.sql.Date.valueOf(doR));
				pst.setInt(2, id);
				pst.executeUpdate();
				System.out.println("Updated");

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return update;
	}

}
