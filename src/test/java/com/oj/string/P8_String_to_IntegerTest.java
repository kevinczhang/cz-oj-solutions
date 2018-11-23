package com.oj.string;

import org.junit.Assert;
import org.junit.Test;

public class P8_String_to_IntegerTest {

	@Test
	public void testNegtiveValidNum() {
		P8_String_to_Integer solutionToTest = new P8_String_to_Integer();
		Assert.assertEquals(0, solutionToTest.myAtoi("-  21"));
	}	
	
	@Test
	public void testNegtiveOverflow() {
		P8_String_to_Integer solutionToTest = new P8_String_to_Integer();
		Assert.assertEquals(Integer.MIN_VALUE, solutionToTest.myAtoi("-91283472332"));
	}
}
