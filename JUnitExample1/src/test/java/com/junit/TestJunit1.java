package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wipro.unit.MessageUtil;

public class TestJunit1 {

	String message = "DanskeIt";	
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {	
		System.out.println("Inside testPrintMessage()");    
		assertEquals(message, messageUtil.printMessage());    
	}
}
