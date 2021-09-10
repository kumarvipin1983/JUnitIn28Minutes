package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	// AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA // In assertEquals (expected, actual)
	@Test
	public void testTruncateAInFirst2Positions1() {
		StringHelper helper = new StringHelper();	
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
}
