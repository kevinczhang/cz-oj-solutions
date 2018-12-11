package com.oj.other;

public class P268_Missing_Number {
	public int missingNumber1(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= i ^ nums[i];
        }
        return res;
    }
	
	public int missingNumber2(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
        	actualSum += nums[i];
        }
        return expectedSum - actualSum;
    }
}
