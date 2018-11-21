package com.oj.array;

public class P136_Solution {
	public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i]; 
        }
        return res;
    }
}
