package com.kk;


	import java.util.ArrayList;
	import java.util.List;

	public class Employee {
		private String employeeName;
		private List<String> employeeMobileNumber;
		private Long employeeSalary;
		private String employeeEmail;
		Address address;

	public Employee() {
			super();
			
		}
	public Employee(String employeeName, ArrayList<String> employeeMobileNumber, Long employeeSalary,
				String employeeEmail, Address address) {
			super();
			this.employeeName = employeeName;
			this.employeeMobileNumber = employeeMobileNumber;
			this.employeeSalary = employeeSalary;
			this.employeeEmail = employeeEmail;
			this.address = address;
		}
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	public void setEmployeeMobileNumber(List<String> employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}
	public Long getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println("Name:"+getEmployeeName());
		System.out.println("The Contact numbers are:");
		System.out.println(getEmployeeMobileNumber());
		System.out.println("Email:"+getEmployeeEmail());
		System.out.println("Salary:"+getEmployeeSalary());
		
	}
	
	}


