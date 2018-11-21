package com.oj.array.p189;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		Solution solutionToTest = new Solution();
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		solutionToTest.rotate(nums, k);
		int[] expecteds = {5,6,7,1,2,3,4};
		Assert.assertArrayEquals(expecteds, nums);
	}

}
