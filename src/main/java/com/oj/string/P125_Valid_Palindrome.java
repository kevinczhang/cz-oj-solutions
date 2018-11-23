package com.oj.string;

public class P125_Valid_Palindrome {
	public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) return true;
        int start = 0, end = s.length() - 1;
        s = s.toLowerCase();
        while (start < end) {
            while (start < end && !(Character.isLetter(s.charAt(start)) || 
                  Character.isDigit(s.charAt(start)))) start++;
            while (start < end && !(Character.isLetter(s.charAt(end)) ||
                  Character.isDigit(s.charAt(end)))) end--;
            if (start == end) return true;
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
