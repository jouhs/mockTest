package org.jouhs.myapp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class CalServiceTest {

	CalService calService;
	
	@Before
	public void setup() {
		ICalculator cal = mock(ICalculator.class);
		when(cal.add(3,3)).thenReturn(6);
		calService = new CalService();
		calService.setCal(cal);
	}
	
	@Test
	public void testTrueAddTwoNumbers() {
		
		Assert.assertEquals(6, calService.adddTwoNumbers(3, 3));
	}
	
	@Test
	public void testFalseAddTwoNumbers() {
		
		Assert.assertNotEquals(7, calService.adddTwoNumbers(3, 3));
	}
}
