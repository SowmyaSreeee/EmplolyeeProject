package com.wirpro.collections;

public class TestBoundedParameter<T extends Number>  {
	private T value;
	
	public TestBoundedParameter(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	public void printValue() {
		System.out.println("VAlue = " + value);
	}
	
	public static void main(String[] args) {
		TestBoundedParameter<Integer> intExample = new TestBoundedParameter<>(123);
		intExample.printValue();
		
		TestBoundedParameter<Double> dblExample = new TestBoundedParameter<>(12.83);
		dblExample.printValue();
	}
}
