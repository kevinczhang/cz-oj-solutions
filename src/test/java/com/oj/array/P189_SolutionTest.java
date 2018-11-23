package com.oj.array;

import org.junit.Assert;
import org.junit.Test;

import com.oj.array.P189_Rotate_Image;

public class P189_SolutionTest {

	@Test
	public void test() {
		P189_Rotate_Image solutionToTest = new P189_Rotate_Image();
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		solutionToTest.rotate(nums, k);
		int[] expecteds = {5,6,7,1,2,3,4};
		Assert.assertArrayEquals(expecteds, nums);
	}

}
