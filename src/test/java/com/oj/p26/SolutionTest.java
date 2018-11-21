package com.oj.p26;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testNoDuplicates() {
		Solution solutionToTest = new Solution();
		int[] nums = {0, 1, 2, 3, 4, 5};
	 	assertEquals(6, solutionToTest.removeDuplicates(nums));
	}
	
	@Test
	public void testAllDuplicates() {
		Solution solutionToTest = new Solution();
		int[] nums = {0, 0, 0, 0, 0, 0};
	 	assertEquals(1, solutionToTest.removeDuplicates(nums));
	}
	
	@Test
	public void testDuplicatesAtFirst() {
		Solution solutionToTest = new Solution();
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
	 	assertEquals(5, solutionToTest.removeDuplicates(nums));
	}

}
