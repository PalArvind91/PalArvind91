package com.yash.advanced;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ApplicationServiceTest {
	
	@Mock
	private ApplicationService mockService;
	
	@InjectMocks
	private ApplicationTest applicationTest;

	@Test
	public void testAddApplication() {
		
		Application app = new Application(101,"Transport Management");
		Mockito.when(mockService.addApplication(app)).thenReturn(101);
		int expected = applicationTest.addApplication();
		assertEquals(101, expected);
		
	}
}
