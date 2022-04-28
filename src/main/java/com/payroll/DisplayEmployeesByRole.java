package com.payroll;

import java.util.List;

import com.payroll.DAO.DisplayEmployeesByRoleDAO;

import com.payroll.model.User;

public class DisplayEmployeesByRole {
	public static void main(String[] args) throws Exception {
		List<User> employees = DisplayEmployeesByRoleDAO.displayByRole();
		System.out.println(employees);

	}

}
