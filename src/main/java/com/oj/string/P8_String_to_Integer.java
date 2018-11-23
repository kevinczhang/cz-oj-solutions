package com.oj.string;

public class P8_String_to_Integer {
	public int myAtoi(String str) {
		long res = 0;
		if (str == null) return 0;
        str = str.trim();
        if (str.length() == 0) return 0;
        
        // Check first character
        char firstChar = str.charAt(0);
        int sign = 1;
        if (firstChar == '+' || firstChar == '-') {
        	sign = firstChar == '-' ? -1 : 1;
        	str = str.substring(1);
        }
        // Check char if digit after first char
        if (str.length() == 0 || !Character.isDigit(str.charAt(0))) return 0;
        
        int curInd = 0;
        while (curInd < str.length() && Character.isDigit(str.charAt(curInd))) {
        	res = res *10 + str.charAt(curInd++) - '0';
        	if (sign*res > Integer.MAX_VALUE) {
        		return Integer.MAX_VALUE;
        	}
        	
        	if (sign*res < Integer.MIN_VALUE) {
        		return Integer.MIN_VALUE;
        	}
        }        
        
        return (int)(sign*res);
    }
}
