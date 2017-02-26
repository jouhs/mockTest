package org.jouhs.myapp;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalServiceAtMockTest {

	@Mock
	ICalculator calService;
	
	@Before
	public void setup() {
		when(calService.add(3,3)).thenReturn(6);
	}
	
	@Test
	public void testTrueAddTwoNumbers() {
		
		Assert.assertEquals(6, calService.add(3, 3));
	}
	
	@Test
	public void testFalseAddTwoNumbers() {
		
		Assert.assertNotEquals(6, calService.add(3, 3));
	}
	
}
