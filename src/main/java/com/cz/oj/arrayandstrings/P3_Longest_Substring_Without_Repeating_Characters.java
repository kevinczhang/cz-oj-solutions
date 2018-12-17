package com.cz.oj.arrayandstrings;

import java.util.HashMap;
import java.util.Map;

public class P3_Longest_Substring_Without_Repeating_Characters {
	public int lengthOfLongestSubstring(String s) {
		if(s == null || s.length() == 0) return 0;
        int res = 0;
        int startInd = -1;
        Map<Character, Integer> charToIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
        	char cur = s.charAt(i);
            if(charToIndex.containsKey(cur)){
                startInd = Math.max(startInd, charToIndex.get(cur));                
            }
            res = Math.max(res, i - startInd);
            charToIndex.put(s.charAt(i), i);            
        }
        return res;        
    }
}
