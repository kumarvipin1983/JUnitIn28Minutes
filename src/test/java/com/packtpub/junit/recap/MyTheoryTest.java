package com.packtpub.junit.recap;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class MyTheoryTest {

	@DataPoint 
	public static String jack = "Jack";
	
	@DataPoint
	public static String mike = "Mike";
	
	@DataPoint
	public static char[] chars = new char[] {'A', 'B', 'C'}; 
	
	@Theory 
	public void testSanity(String aName) {
		System.out.println("Sanity Check " + aName);
	}
	
	@Theory 
	public void testSanity(String firstName, String lastName) {
		System.out.println("Sanity Check " + firstName + ", " + lastName);
	}
	
	@Theory 
	public void testBuildChar(char c, char d) {
		System.out.println(c + " " + d);
	}
}
