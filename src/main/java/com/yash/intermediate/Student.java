package com.yash.intermediate;

public class Student {

	public int Student_id;
	public String Student_name;
	public String Student_class;
	public static int count =0;
	public Student(int student_id, String student_name, String student_class) {
		super();
		Student_id = student_id;
		Student_name = student_name;
		Student_class = student_class;
		count++;
	}
}
