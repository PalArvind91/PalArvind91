package com.yash.intermediate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AuthorTest {
	
	Author author = new Author();
	
	@Test
	public void testwrittenByAuthor() {
		
		assertEquals(2, author.totalbookswrittenByAuthor("MGH"));
		
	}
	
	@Test
	public void testwrittenByAuthor2() {
		
		assertEquals(2, author.totalbookswrittenByAuthor("BVP"));
		
	}

}
