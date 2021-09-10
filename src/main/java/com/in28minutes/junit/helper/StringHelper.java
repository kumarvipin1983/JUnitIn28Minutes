package com.in28minutes.junit.helper;

public class StringHelper {
	
	// AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
	public String truncateAInFirst2Positions(String str) {
		if (str.length() <= 2) {
			return str.replaceAll("A", "");
		}
		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);
		
		return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
	}
}
