package com.cz.oj.arraystring.threesum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testThreeSum() {
		Solution solutionToTest = new Solution();
		int[] nums = {-1, 0, 1, 2, -1, -4};
	 	assertEquals(2, solutionToTest.threeSum(nums).size());
	}

}
