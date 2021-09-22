package com.dev;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitClass {

	@Test
	public void setup() {
		String str = "Test 01";
		assertEquals("Test 01", str);
	}

}
