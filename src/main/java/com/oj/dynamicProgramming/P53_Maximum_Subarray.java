package com.oj.dynamicProgramming;

public class P53_Maximum_Subarray {
	
	// DP solution
	public int maxSubArrayDP(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		// Sum with last element
        int sumWithEnd = nums[0];
        // Global max
        int max = sumWithEnd;
        for (int i = 1; i < nums.length; i++) {
            // Check if sum without current value
            if (sumWithEnd > 0) {
                sumWithEnd = sumWithEnd + nums[i];                
            } else {
                sumWithEnd = nums[i];
            }
            if (sumWithEnd > max) {
                    max = sumWithEnd;
            }
        }
        return max;        
    }
	
	// Divide and conquor solution
	public int maxSubArrayDC(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
				
        return maxSubArr(nums, 0, nums.length - 1);       
    }

	private int maxSubArr(int[] nums, int start, int end) {
		// This is critical too
		if (start > end) return Integer.MIN_VALUE;
		if (start == end) return nums[start];
		int mid = start + (end - start) / 2;
		
		int leftMax = maxSubArr(nums, start, mid - 1);
		int rightMax = maxSubArr(nums, mid + 1, end);
		
		int midMax = nums[mid];
		// Used to track local summary
		int curSum = nums[mid];
		for (int i = mid - 1; i >= start; i--) {
			curSum += nums[i];
			if (curSum > midMax) {
				midMax = curSum;
			}
		}
		// The max so far on the left
		curSum = midMax;
		for (int i = mid + 1; i <= end; i++) {
			curSum += nums[i];
			if (curSum > midMax) {
				midMax = curSum;
			}
		}
		return Math.max(Math.max(leftMax, rightMax), midMax);
	}
}
