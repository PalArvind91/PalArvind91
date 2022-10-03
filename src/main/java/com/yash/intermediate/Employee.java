package com.yash.intermediate;

public class Employee {
	
	String emp_Name;
	String emp_Designation;
	int emp_Id;
	static int count =0;
	
	public Employee(String emp_Name, String emp_Designation, int emp_Id) {
		super();
		this.emp_Name = emp_Name;
		this.emp_Designation = emp_Designation;
		this.emp_Id = emp_Id;
		count++;
	}
	

}
