package com.oj.array;

public class P66_Solution {
	public int[] plusOne(int[] digits) {        
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + carry > 9) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] += 1;
                carry = 0;
                break;
            }
        }
        if (carry == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
