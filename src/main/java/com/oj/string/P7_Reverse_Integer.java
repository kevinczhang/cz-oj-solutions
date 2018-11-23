package com.oj.string;

public class P7_Reverse_Integer {
	public int reverse(int x) {
        long res = 0;
        int sign = x > 0 ? 1 : -1;
        x = sign*x;
        
        while (x > 0) {
            res = res * 10 + x % 10;
            if (sign*res > Integer.MAX_VALUE || sign*res < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int)(sign*res);
    }
}
