package com.yash.intermediate;

public class Hostel {
	
	public int registerStudents(int n) {
		
		for(int i=0;i<n;i++) {
			createStudent();
		}
		
		return Student.count;
	}
	
	
	public static Student createStudent()
    {
        
		return new Student(101,"abhay", "MCA");
    }

}
