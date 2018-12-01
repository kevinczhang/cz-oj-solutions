package com.oj.dynamicProgramming;

public class P70_Climbing_Stairs {
	public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int i = 2;        
        int oneStepBefore = 2;
        int twoStepBefore = 1;
        int res = 0;
        while (n > i) {
            res = oneStepBefore + twoStepBefore;            
            twoStepBefore = oneStepBefore;
            oneStepBefore = res;
            i++;
        }
        return res;
    }
}
