package com.java.learning;

public class Employee {
	private int empId; 
	private String name;
	
	//This variable will be common in all instance variable of type Employee class
	private static String company = "Smart Programming";
	private static int count=0; 
	
	public Employee() {
	}

	public Employee(int empId, String name) {
		count++;
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "company=" + company + ", count=" + count + "]";
	}
}