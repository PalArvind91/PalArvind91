package com.yash.intermediate;

public class Company {
	
	public int getEmployeeCount(int n) {
		for(int i=0;i<n;i++) {
			createEmployee();
		}
		return Employee.count;
	}
	
	public static Employee createEmployee() {
		
		return new Employee("arvind", "SSD", 1001);
	}

}
