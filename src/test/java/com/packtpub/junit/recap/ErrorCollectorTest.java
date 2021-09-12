package com.packtpub.junit.recap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorTest {

	@Rule
	public ErrorCollector collector = new ErrorCollector(); 
	
	@Test
	public void testFailAfterExecution() {
		// checkThat (actual, expected); 
		collector.checkThat("a", equalTo("b"));
		collector.checkThat(1, equalTo(2));
		collector.checkThat("ae", equalTo("g"));
	}
}