package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wipro.unit.MessageUtil;

public class TestJunit2 {

	String message = "Robert";
	MessageUtil msgUtil = new MessageUtil(message);
	
	@Test
	public void testsalutationMessage() {
		message = "Hi!" + "Robert";
		assertEquals(message, msgUtil.salutationMessage());
	}
}

