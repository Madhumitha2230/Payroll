package com.payroll;

import java.util.Scanner;


public class MonthlySalary {
	public static void main(String[]args) {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			int empid=sc.nextInt();
			int month=sc.nextInt();
			int year=sc.nextInt();
			int no_of_days=sc.nextInt();
			int leave_days=sc.nextInt();
			int salary=sc.nextInt();
			String status=sc.next();
			

			String result=MonthlySalaryDAO.monthlySalary(empid, month,  year, no_of_days,  leave_days,  salary,
			 status) ;
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
