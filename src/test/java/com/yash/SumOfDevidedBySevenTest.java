package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfDevidedBySevenTest {
	
	SumofDevidedBySeven divbyseven = new SumofDevidedBySeven();
	
	@Test
	public void testdevidedByseven1() {
		
		assertEquals(2107, divbyseven.sumDevidedByseven());
	}

	@Test
	public void testdevidedByseven2() {
		
		assertEquals(2100, divbyseven.sumDevidedByseven());
	}

}
