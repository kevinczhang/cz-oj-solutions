package com.oj.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import com.oj.common.TreeNode;

public class P102_Binary_Tree_Level_Order_Traversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
List<List<Integer>> res = new ArrayList<>();
        
        if (root == null) return res;
        
        Deque<TreeNode> curLevel = new ArrayDeque<>();
        Deque<TreeNode> nextLevel = new ArrayDeque<>();
        curLevel.addFirst(root);
        
        
        List<Integer> cur = new ArrayList<>();
        
        while (!curLevel.isEmpty()) {       	
        	TreeNode curNode = curLevel.pollLast();
        	if (curNode.left != null) {
        		nextLevel.addFirst(curNode.left);
        	}
        	if (curNode.right != null) {
        		nextLevel.addFirst(curNode.right);
        	}
        	cur.add(curNode.val);
        	if (curLevel.isEmpty()) {
        		res.add(cur);
                cur = new ArrayList<>();
        		curLevel = new ArrayDeque<>(nextLevel);
        		nextLevel.clear();
        	}        	
        }
        
		return res;
    }
}
