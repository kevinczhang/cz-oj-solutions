package com.oj.string;

public class P242_Valid_Anagram {
	public boolean isAnagram(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        
        if (s.length() == 0 && t.length() == 0) return true;
        if (s.length() == 0 || t.length() == 0 || s.length() != t.length()) 
            return false;
        
        int[] sCharsCount = new int[26];
        int[] tCharsCount = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            sCharsCount[s.charAt(i) - 'a'] += 1;
            tCharsCount[t.charAt(i) - 'a'] += 1;
        }
        
        for (int i = 0; i < 26; i++) {
            if (sCharsCount[i] != tCharsCount[i])
                return false;
        }
        return true;
    }
}
