package com.packtpub.junit.recap;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.in28minutes.junit.helper.Adder;

@RunWith(Theories.class)
public class ExternalTheoryTest {

	public static Adder anAdder;

	@BeforeClass
	public static void before() {
		anAdder = new Adder();
	}

	@Theory
	public void testAddNumbers(@ParametersSuppliedBy(NumberSupplier.class) Number num1,
			@ParametersSuppliedBy(NumberSupplier.class) Number num2) {
		assertEquals(num1.doubleValue() + num2.doubleValue(), (Double) anAdder.add(num1, num2), 0.01);

		// System.out.println(num1 + " and " + num2);
	}

	@Theory
	public void testAddStrings(@ParametersSuppliedBy(StringSupplier.class) String str1,
			@ParametersSuppliedBy(StringSupplier.class) String str2) {
		String expected = str1 + str2;
		String actual = (String) anAdder.add(str1, str2);
		assertEquals(expected, actual);
	}
}
