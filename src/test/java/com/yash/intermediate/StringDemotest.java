package com.yash.intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringDemotest {
	
	StringDemo demo = new StringDemo();
	
	@Test
	public void testStringLength() {
		
		assertEquals(11, demo.StringLength("programming"));
	}
	
	@Test
	public void testConcate() {
		
		assertEquals("java programming", demo.StringConcate("java", "programming"));
	}

}
