package com.payroll;

import java.util.List;

import com.payroll.DAO.UpdateDateOfReleivingDAO;
import com.payroll.model.User;

public class UpdateDateOfReleiving {
	public static void main(String[] args) throws Exception {
		List<User> update=UpdateDateOfReleivingDAO.updateDateOfReleiving() ;
		System.out.println(update);
	}

}
