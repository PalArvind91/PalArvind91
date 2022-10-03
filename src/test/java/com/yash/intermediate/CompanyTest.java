package com.yash.intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CompanyTest {
	
	Company com = new Company();
	
	@Test
	public void testEmployeeCount1() {
		
		assertEquals(2, com.getEmployeeCount(2));
		
	}

}
