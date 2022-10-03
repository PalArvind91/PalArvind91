package com.yash.intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringTest {

	String str = "java programming";
	
	@Test
	public void testStringLength() {
		
		assertEquals(16, str.length());
	}
	
	@Test
	public void testIndexOfTest() {
		
		assertEquals(2, str.indexOf('v'));
	}
	
	@Test
	public void testCharAt() {
		
		assertEquals('v', str.charAt(2));
	}
	
	@Test
	public void testContains() {
		
		assertTrue(str.contains("java"));
	}
	
	@Test
	public void testConcate() {
		
		assertEquals("java programming language", str.concat(" language"));
	}
}
