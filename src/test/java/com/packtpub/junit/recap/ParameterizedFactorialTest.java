package com.packtpub.junit.recap;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.in28minutes.junit.helper.Factorial;

@RunWith(Parameterized.class)
public class ParameterizedFactorialTest {

	private int number; 
	private int expectedResult; 
	
	public ParameterizedFactorialTest(int number, int expectedResult) {
		super();
		this.number = number;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection<Object[]> factorialData() {
		return Arrays.asList(new Object[][] {  
			{0, 1},
			{1, 1},
			{2, 2}, 
			{3, 6}, 
			{4, 24}, 
			{5, 120},
			{6, 720}
		});
	}
	
	@Test (timeout=10)
	public void testFactorial() {
		Factorial fact = new Factorial(); 
		assertEquals(expectedResult, fact.factorial(number)); 
	}
}
