package com.oj.design;

public class P384_Shuffle_an_Array {
	int[] origin;

    public P384_Shuffle_an_Array(int[] nums) {
        this.origin = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.origin;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] shuffledArray = new int[origin.length];
        boolean[] valueSet = new boolean[origin.length];
        int i = 0;
        while (i < origin.length) {
            int randomInd = (int) (Math.random()*origin.length);
            if (!valueSet[randomInd]) {
                shuffledArray[i] = origin[randomInd];
                valueSet[randomInd] = true;
                i++;
            }            
        }
        return shuffledArray;
    }
}
