package com.wipro.unit;

public class calculator implements Icalculator{

	public int sum(int a, int b) {
		return a+b;
	}

	public int subtraction(int a, int b) {
		return a-b;
	}

	public int multiplication(int a, int b) {
		return a*b;
	}

	public int division(int a, int b) throws Exception {
		if(b == 0 ) {
			throw new Exception("Divider cant be Zero");
		}
		return a/b;
	}

	public boolean equalIntegers(int a, int b) {
		return a==b;
	}
	

}
