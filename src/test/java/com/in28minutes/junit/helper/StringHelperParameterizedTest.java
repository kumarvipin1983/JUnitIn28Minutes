package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) //1
public class StringHelperParameterizedTest {
	
	StringHelper helper; 
	
	private String input;    //2
	private String expectedOutput; 
	
	public StringHelperParameterizedTest(String input, String expectedOutput) { //3
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters													//4
	public static Collection<String[]> testConsiditions() {
		String expectedOutputs[][] = {
				{"AACD", "CD"},
				{"ACD" , "CD"}
		};
		return Arrays.asList(expectedOutputs); 
	}
	
	@Before
	public void before() {
		helper = new StringHelper(); 
	}

	// AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA // In assertEquals (expected, actual)
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
}
