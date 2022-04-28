package com.payroll.model;

public class MonthlySalaryModel {
	private int emp_id;
	private int month;
	private int year;
	private int no_of_days;
	private int leave_days;
	private int salary;
	private String status;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	public int getLeave_days() {
		return leave_days;
	}
	public void setLeave_days(int leave_days) {
		this.leave_days = leave_days;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "MonthlySalaryModel [emp_id=" + emp_id + ", month=" + month + ", year=" + year + ", no_of_days="
				+ no_of_days + ", leave_days=" + leave_days + ", salary=" + salary + ", status=" + status + "]";
	}
	

}
