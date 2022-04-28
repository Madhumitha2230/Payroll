package com.payroll;

import java.sql.SQLException;
import java.util.List;

import com.payroll.DAO.DisplayEmployeesDAO;
import com.payroll.model.User;

public class DisplayEmployees {

	public static void main(String[] args) throws SQLException {

		List<User> employees = DisplayEmployeesDAO.display();
		System.out.println(employees);

	}

}