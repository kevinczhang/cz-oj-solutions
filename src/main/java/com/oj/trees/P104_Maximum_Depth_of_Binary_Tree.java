package com.oj.trees;

import com.oj.common.TreeNode;

public class P104_Maximum_Depth_of_Binary_Tree {
	public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
