package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvenOddCountTest {
	
	EvenOddCount count = new EvenOddCount();
	
	
	@Test
	public void testEvenOddCount1() {
		assertEquals("4 even digits and 5 odd digits", count.evenAndOddCount(542587545));
	}
	
	@Test
	public void testEvenOddCount2() {
		assertEquals("4 even digits and 5 odd digits", count.evenAndOddCount(4253));
	}


}
