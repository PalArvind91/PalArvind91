package com.yash.intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarSoldTest {

	CarSold car = new CarSold();
	
	@Test
	public void testCarSold1() {
		assertEquals(3, car.carSoldCount(3));
	}
	
	@Test
	public void testCarSold2() {
		assertEquals(2, car.carSoldCount(4));
	}
}
