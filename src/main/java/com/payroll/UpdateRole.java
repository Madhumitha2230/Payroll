package com.payroll;

import java.util.List;

import com.payroll.DAO.UpdateRoleDAO;
import com.payroll.model.User;

public class UpdateRole {

	public static void main(String[] args) throws Exception {
		List<User> updateRole = UpdateRoleDAO.updateRole();
		System.out.println(updateRole);
	}

}
