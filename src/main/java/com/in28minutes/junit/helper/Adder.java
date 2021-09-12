package com.in28minutes.junit.helper;

public class Adder {
	
	public Object add(Number a, Number b) {
		return a.doubleValue() + b.doubleValue(); 
	}
	
	public Object add(String a, String b) {
		return a+b; 
	}
}
