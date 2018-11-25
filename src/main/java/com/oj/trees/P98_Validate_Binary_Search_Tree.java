package com.oj.trees;

import com.oj.common.TreeNode;

public class P98_Validate_Binary_Search_Tree {
	public boolean isValidBST(TreeNode root) {
        if (root == null || root.left == null && root.right == null) 
            return true;
        
        return validTree(root.left, (long)(Integer.MIN_VALUE) - 1, (long)root.val) &&
            validTree(root.right, (long)root.val, (long)(Integer.MAX_VALUE) + 1);
    }
    
    private boolean validTree (TreeNode root, long lower, long upper) {
        if (root == null) return true;
        if (root.val <= lower || root.val >= upper) return false;
        
        return validTree(root.left, lower, root.val) &&
            validTree(root.right, root.val, upper);
    }
}
