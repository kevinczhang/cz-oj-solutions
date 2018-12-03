package com.oj.design;

import static org.junit.Assert.*;

import org.junit.Test;

public class P384_Shuffle_an_ArrayTest {

	@Test
	public void testShuffle() {
		int[] nums = {1,2,3};
		P384_Shuffle_an_Array solutionToTest = new P384_Shuffle_an_Array(nums);
		int[] res = solutionToTest.shuffle();
		assertNotNull(res);
	}

}
