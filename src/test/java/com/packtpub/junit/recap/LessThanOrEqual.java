package com.packtpub.junit.recap;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

public class LessThanOrEqual<T extends Comparable<T>> extends BaseMatcher<Comparable<T>> {
	private final Comparable<T> expectedValue;

	public LessThanOrEqual(Comparable<T> expectedValue) {
		super();
		this.expectedValue = expectedValue;
	}

	public boolean matches(Object item) {
		int compareTo = expectedValue.compareTo((T)item);
		return compareTo > -1;
	}


	public void describeTo(Description description) {
		description.appendText(" less than or equals (<=) " + expectedValue);
	} 
	
	@Factory 
	public static <T extends Comparable <T>> Matcher<T> lessThanOrEqual(T t) {
		return new LessThanOrEqual(t);
	}
}
											