package com.wipro.unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit1 {

	String message = "wipro";
	MessageUtil msgUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		assertEquals(message , msgUtil.printMessage());
	}
	
}
