package com.payroll;

import java.util.List;

import com.payroll.DAO.DisplayActiveEmployeesDAO;
import com.payroll.model.User;

public class DisplayActiveEmployees {
	public static void main(String []args) throws Exception {
		List<User>employeesByRole=DisplayActiveEmployeesDAO.displayActiveEmployees();
		System.out.println(employeesByRole);
	}

}
 