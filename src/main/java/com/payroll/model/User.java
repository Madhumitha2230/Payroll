package com.payroll.model;

import java.sql.Date;

public class User {

	private int empId;
	private String name;
	private String email;
	private String password;
	private Date dob;
	private String role;
	private Date dateOfJoining;
	private Date dateOfReleiving;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfReleiving() {
		return dateOfReleiving;
	}

	public void setDateOfReleiving(Date dateOfReleiving) {
		this.dateOfReleiving = dateOfReleiving;
	}

	@Override
	public String toString() {
		return "User [empId=" + empId + ", name=" + name + ", email=" + email + ", password=" + password + ", dob="
				+ dob + ", role=" + role + ", dateOfJoining=" + dateOfJoining + ", dateOfReleiving=" + dateOfReleiving
				+ "]";
	}

}