package com.packtpub.junit.recap;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;

@FixMethodOrder
public class AssertTest {

	@Test
	public void assertTrueAndFalseTest() throws Exception {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
	}
	
	@Test
	public void assertNullAndNotNullTest() throws Exception {
		Object myObject = null; 
		Assert.assertNull(myObject);
		myObject = new String ("Some value");
		Assert.assertNotNull(myObject);
	}
	
	@Test
	public void assertEqualsTest () throws Exception {
		Integer i = Integer.parseInt("5");
		Integer j = Integer.parseInt("5");
		assertEquals(i,j);		
	}
	
	@Test
	public void assertSameTest() throws Exception {
		Integer i = Integer.parseInt("5");
		Integer j = Integer.parseInt("5");
		assertSame(i, j);
	}
	
	@Test(expected=RuntimeException.class)
	public void exception() {
		throw new RuntimeException();
	}

	@Ignore("Ricky is on holiday and not available, will resume test when return")
	public void assertNotSameTest() throws Exception {
		Integer i = Integer.parseInt("5");
		Integer j = Integer.parseInt("5");
		assertNotSame(i, j);
	}
	
	@Test (timeout=100)
	public void testForEverTimePerformance() throws Exception {
		Thread.sleep(10);
	}
}