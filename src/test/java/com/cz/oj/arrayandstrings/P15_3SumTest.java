package com.cz.oj.arrayandstrings;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cz.oj.arrayandstrings.P15_3Sum;

public class P15_3SumTest {

	@Test
	public void testThreeSum() {
		P15_3Sum solutionToTest = new P15_3Sum();
		int[] nums = {-1, 0, 1, 2, -1, -4};
	 	assertEquals(2, solutionToTest.threeSum(nums).size());
	}

}
