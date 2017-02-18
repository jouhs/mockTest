package org.jouhs.myapp;

import org.junit.Assert;
import org.junit.Test;

public class CalServiceTest {

	CalService calService;
	
	public void setup() {
		calService = new CalService();
	}
	
	@Test
	public void testAddTwoNumbers() {
		
		Assert.assertEquals(6, calService.adddTwoNumbers(3, 3));
	}
}
