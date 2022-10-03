package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplyNumberTest {
	
	MultiplyNumber multiply = new MultiplyNumber();
	
	@Test
	public void testMultiply1() {
		
		assertEquals(6, multiply.multiplyNumber(123));
	}
	
	@Test
	public void testMultiply2() {
		
		assertEquals(0, multiply.multiplyNumber(0));
	}

}
