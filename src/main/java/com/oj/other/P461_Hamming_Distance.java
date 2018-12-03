package com.oj.other;

public class P461_Hamming_Distance {
	public int hammingDistance(int x, int y) {
        int oxRes = x^y;
        int res = 0;
        while (oxRes != 0) {
            res++;
            oxRes &= (oxRes - 1);
        }
        return res;
    }
}
