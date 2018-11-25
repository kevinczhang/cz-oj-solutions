package com.oj.trees;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oj.common.TreeNode;

public class P108_Convert_Sorted_Array_to_Binary_Search_TreeTest {

	@Test
	public void testSortedArrayToBST() {
		P108_Convert_Sorted_Array_to_Binary_Search_Tree solutionToTest = 
				new P108_Convert_Sorted_Array_to_Binary_Search_Tree();
		
		int[] nums = {1, 2};
		TreeNode res = solutionToTest.sortedArrayToBST(nums);
		assertEquals(2, res.val);
	}

}
