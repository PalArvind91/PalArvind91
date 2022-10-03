package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfExpressionTest {
	
	SumOfExpression exp = new SumOfExpression();
	
	@Test
	public void testgetSumOfExpression1() {
		
		assertEquals(9, exp.getSumOfExpression("2+3+4"));
		
	}
	
	@Test
	public void testgetSumOfExpression2() {
		
		assertEquals(14, exp.getSumOfExpression("2+3+4+8"));
		
	}


}
