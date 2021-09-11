package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper; 
	
	@Before
	public void before() {
		helper = new StringHelper(); 
	}

	// AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA // In assertEquals (expected, actual)
	@Test
	public void testTruncateAInFirst2Positions1() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
}
