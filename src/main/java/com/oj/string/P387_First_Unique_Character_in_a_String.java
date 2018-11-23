package com.oj.string;

public class P387_First_Unique_Character_in_a_String {
	public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) return -1;
        int[] charFirstInds = new int[26];
        int[] charCounts = new int[26];
        charCounts[s.charAt(0) - 'a'] = 1;
        int res = s.length();
        for (int i = 1; i < s.length(); i++) {
            int charInt = s.charAt(i) - 'a';
            if (charFirstInds[charInt] ==  0) {
                charFirstInds[charInt] = i;
            }
            charCounts[charInt] += 1;
        }
        
        for (int i = 0; i < 26; i++) {
            if (charCounts[i] == 1 && charFirstInds[i] < res) {
                res =  charFirstInds[i];
            }
        }
        return res == s.length() ? -1 : res;
    }
}
