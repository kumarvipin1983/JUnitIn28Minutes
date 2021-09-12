package com.packtpub.junit.recap;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;
import com.packtpub.junit.recap.LessThanOrEqual;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Ignore;
import org.junit.Test;

public class AssertThatTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testVerifyMatcher() throws Exception {
		int age = 30;
		assertThat(age, equalTo(30));
		assertThat(age, is(30));
		assertThat(age, not(equalTo(33)));
		assertThat(age, is(not(33)));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testVerifyMultipleValues() throws Exception {
		double marks = 100;
		assertThat(marks, either(is(100.00)).or(is(90.9)));
		assertThat(marks, both(not(99.99)).and(not(60.00)));
		assertThat(marks, anyOf(is(100.00), is(1.00), is(55.00), is(88.00), is(67.8)));
		assertThat(marks, not(anyOf(is(0.00), is(200.00))));
		assertThat(marks, not(allOf(is(1.00), is(100.00), is(30.00))));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testVerifyCollectionValues() throws Exception {
		List<Double> salary = Arrays.asList(50.0, 200.0, 500.0);
		assertThat(salary, hasItem(50.0));
		assertThat(salary, hasItems(50.0, 200.0));
		assertThat(salary, not(hasItem(1.00)));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testVerifyStrings() throws Exception {
		String name = "John Jr Dale";
		assertThat(name, startsWith("John"));
		assertThat(name, endsWith("Dale"));
		assertThat(name, containsString("Jr"));	
	}

	@Test
	@Ignore
	public void testLessThanOrEqualCustomMatcher() throws Exception {
		int actualGoalScored = 2;
		/*
		 * assertThat(actualGoalScored, lessThanOrEqual(4));
		 * assertThat(actualGoalScored, lessThanOrEqual(2));
		 */
		assertThat(actualGoalScored, is(2));
	}
}
