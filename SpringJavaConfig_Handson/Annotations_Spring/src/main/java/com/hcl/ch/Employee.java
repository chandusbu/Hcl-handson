package com.hcl.ch;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
public Employee(String employeeName, Long employeeMobileNumber, Long employeeSalary, String employeeEmail,
			Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeMobileNumber = employeeMobileNumber;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.address = address;
	}
	private String employeeName;
	private Long employeeMobileNumber;
	private Long employeeSalary;
	private String employeeEmail;
	
	private Address address;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Long getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	public void setEmployeeMobileNumber(Long employeeMobileNumber) {
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
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public void Display() {
		System.out.println("Name:"+getEmployeeName());
		System.out.println("Mobile:"+getEmployeeMobileNumber());
		System.out.println("Salary:"+getEmployeeSalary());
		System.out.println("Email:"+getEmployeeEmail());
		
	}
	
	
}
