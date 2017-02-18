package org.jouhs.myapp;

public class CalService {
	ICalculator cal;

	public int adddTwoNumbers(int x, int y) {
		return cal.add(x, y);
	}
}
