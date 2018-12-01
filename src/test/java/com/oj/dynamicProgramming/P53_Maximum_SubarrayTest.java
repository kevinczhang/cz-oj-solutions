package com.oj.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

public class P53_Maximum_SubarrayTest {

	@Test
	public void testMaxSubArrayDC() {
		P53_Maximum_Subarray solutionToTest = new P53_Maximum_Subarray();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int res = solutionToTest.maxSubArrayDC(nums);
		Assert.assertEquals(6, res);
	}

}
