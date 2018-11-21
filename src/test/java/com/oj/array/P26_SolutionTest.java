package com.oj.array;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oj.array.P26_Solution;

public class P26_SolutionTest {

	@Test
	public void testNoDuplicates() {
		P26_Solution solutionToTest = new P26_Solution();
		int[] nums = {0, 1, 2, 3, 4, 5};
	 	assertEquals(6, solutionToTest.removeDuplicates(nums));
	}
	
	@Test
	public void testAllDuplicates() {
		P26_Solution solutionToTest = new P26_Solution();
		int[] nums = {0, 0, 0, 0, 0, 0};
	 	assertEquals(1, solutionToTest.removeDuplicates(nums));
	}
	
	@Test
	public void testDuplicatesAtFirst() {
		P26_Solution solutionToTest = new P26_Solution();
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
	 	assertEquals(5, solutionToTest.removeDuplicates(nums));
	}

}
