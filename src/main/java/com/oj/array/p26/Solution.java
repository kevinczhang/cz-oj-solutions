package com.oj.array.p26;

public class Solution {
	public int removeDuplicates(int[] nums) {
		if(nums == null) return 0;
		if(nums.length <= 1) return nums.length;
				
		int count = 0;
		int curInd = 1;
		while(curInd < nums.length) {
			if(nums[curInd] != nums[count]) {				
				count++;
				nums[count] = nums[curInd];
			}
			curInd++;
		}
		
		return count + 1;
	}
}
