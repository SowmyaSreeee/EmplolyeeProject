package com.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.wipro.unit.Icalculator;
import com.wipro.unit.calculator;

public class CalculatorTest {
	private static Icalculator iCalc;
	
	@BeforeClass
	public static void initCalculator() {
		iCalc = new calculator();
		System.out.println("Hello ! Before Class");
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test case");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is executed after each Test case");
	}
	
	@Test
	public void testSum() {
		int result = iCalc.sum(3, 4);
		assertEquals(7, result);
	}
	
	@Test
	public void testDivision() {
		try {
			int result = iCalc.division(10, 0);
			assertEquals(5, result);
		}catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
	
	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		iCalc.division(10, 0);
	}
	
	@Ignore
	@Test
	public void testEqual() {
		boolean result = iCalc.equalIntegers(21, 20);
 
		assertFalse(result);
	}
 
	@Ignore
	@Test
	public void testSubstraction() {
		int result = 10 - 3;
 
		assertTrue(result == 9);
	}
	
}
