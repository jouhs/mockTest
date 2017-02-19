package org.jouhs.myapp;

public class CalService {
	ICalculator cal;

	public ICalculator getCal() {
		return cal;
	}

	public void setCal(ICalculator cal) {
		this.cal = cal;
	}

	public int adddTwoNumbers(int x, int y) {
		return cal.add(x, y);
	}
}
