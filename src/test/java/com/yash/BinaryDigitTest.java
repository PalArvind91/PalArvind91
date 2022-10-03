package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryDigitTest {
	
	BinaryDigit digit = new BinaryDigit();
	
	@Test
	public void testBinaryDigit1() {
		assertEquals("1010", digit.BinaryDigit(10));
	}
	
	@Test
	public void testBinaryDigit2() {
		assertEquals("1010", digit.BinaryDigit(7));
	}

}
