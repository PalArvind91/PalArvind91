package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConsucutiveAdditionTest {
	ConsecutiveAddition ca = new ConsecutiveAddition();
	
	@Test
	public void testAddition1() {
		
		assertEquals(55,ca.consucutiveAddition(10));
	}
	
	@Test
	public void testAddition2() {
		
		assertEquals(15,ca.consucutiveAddition(5));
	}
	
	@Test
	public void testAddition3() {
		
		assertEquals(0,ca.consucutiveAddition(0));
	}
	
	@Test
	public void testAddition4() {
		
		assertEquals(8,ca.consucutiveAddition(4));
	}

}
