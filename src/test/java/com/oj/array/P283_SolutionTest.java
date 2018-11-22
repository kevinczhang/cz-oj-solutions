package com.oj.array;

import org.junit.Assert;
import org.junit.Test;

public class P283_SolutionTest {

	@Test
	public void testMoveZeroes() {
		P283_Solution solutionToTest = new P283_Solution();
		int[] nums = {0,1,0,3,12};
		solutionToTest.moveZeroes(nums );
		int[] expecteds = {1,3,12,0,0};
		Assert.assertArrayEquals(expecteds , nums);
	}
	
	@Test
	public void testOnlyZeroes() {
		P283_Solution solutionToTest = new P283_Solution();
		int[] nums = {0,0,0,0,0};
		solutionToTest.moveZeroes(nums );
		int[] expecteds = {0,0,0,0,0};
		Assert.assertArrayEquals(expecteds , nums);
	}
	
	@Test
	public void testOnlyOneZero() {
		P283_Solution solutionToTest = new P283_Solution();
		int[] nums = {0};
		solutionToTest.moveZeroes(nums );
		int[] expecteds = {0};
		Assert.assertArrayEquals(expecteds , nums);
	}
	
	@Test
	public void testOnlyOneNonZero() {
		P283_Solution solutionToTest = new P283_Solution();
		int[] nums = {1};
		solutionToTest.moveZeroes(nums );
		int[] expecteds = {1};
		Assert.assertArrayEquals(expecteds , nums);
	}

}
