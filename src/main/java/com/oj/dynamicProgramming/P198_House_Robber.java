package com.oj.dynamicProgramming;

public class P198_House_Robber {
	public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int robLast = nums[0];
        int notRobLast = 0;
        
        for (int i = 1; i < nums.length; i++) {
            int temp = notRobLast;
            notRobLast = Math.max(robLast, notRobLast);
            robLast = temp + nums[i];            
        }
        
        return Math.max(robLast, notRobLast);
    }
}
