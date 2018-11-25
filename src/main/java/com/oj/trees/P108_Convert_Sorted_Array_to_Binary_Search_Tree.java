package com.oj.trees;

import com.oj.common.TreeNode;

public class P108_Convert_Sorted_Array_to_Binary_Search_Tree {
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0) return null;
		int len = nums.length;
		TreeNode root = new TreeNode(nums[len/2]);
		if (nums.length == 1) return root;
		
		root.left = arrayToBST(nums, 0, len/2 - 1);
		root.right = arrayToBST(nums, len/2 + 1, len - 1);
				
		return root;
    }
	
	private TreeNode arrayToBST (int[] nums, int start, int end) {
		if (end < start) return null;
		int len = end - start + 1;
		TreeNode subTreeRoot = new TreeNode(nums[start + len / 2]);
		subTreeRoot.left = arrayToBST(nums, start, start + len/2 - 1);
		subTreeRoot.right = arrayToBST(nums, start + len/2 + 1, end);
		return subTreeRoot;
	}
}
