package com.oj.trees;

import com.oj.common.TreeNode;

public class P101_Symmetric_Tree {
	public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        
        return isSymmetricTree(root.left, root.right);        
    }
    
    private boolean isSymmetricTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        
        return isSymmetricTree(left.right, right.left) &&
            isSymmetricTree(left.left, right.right);
    }
}
