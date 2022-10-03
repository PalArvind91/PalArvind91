package com.yash.intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HostelTest {
	 Hostel hostel = new Hostel();
	 
	 @Test
	 public void testRegisterStudent() {
		 
		 assertEquals(3, hostel.registerStudents(3));
		 
	 }
	 
	 @Test
	 public void testRegisterStudent1() {
		 
		 assertEquals(5, hostel.registerStudents(5));
		 
	 }


}
