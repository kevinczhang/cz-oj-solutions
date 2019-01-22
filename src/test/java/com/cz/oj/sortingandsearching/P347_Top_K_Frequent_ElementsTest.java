package com.cz.oj.sortingandsearching;

import static org.junit.Assert.*;

import org.junit.Test;

public class P347_Top_K_Frequent_ElementsTest {

	@Test
	public void test() {
		P347_Top_K_Frequent_Elements solutionToTest = new P347_Top_K_Frequent_Elements();
		int[] nums = {1,1,1,2,2,3};
		int k = 2;
		solutionToTest.topKFrequent(nums, k);
	}

}
