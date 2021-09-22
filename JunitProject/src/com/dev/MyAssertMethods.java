package com.dev;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyAssertMethods {

	@Test
	public void testString() {
		String str = new String("test_01");
		String str01 = new String("test_01");
		String str02 = new String("test_02");
		String str03 = null;
		
		String str05 = "test";
		String str06 = "test";

		assertEquals(str, str01);
		assertNotSame(str, str01);
		assertNotEquals(str01, str02);
		assertNull(str03);
		
		assertNotSame(str, str01);
		assertSame(str05, str06);
	}

	@Test
	public void testInt() {
		int v1 = 5;
		int v2 = 6;
		
		assertTrue(v1 < v2);
		assertFalse(v1 > v2);
	}

	@Test
	public void testArrays() {
		String[] a1 = {"One", "Two", "Three"};
		String[] a2 = {"One", "Two", "Three"};
		
		assertArrayEquals(a1, a2);
	}
}
