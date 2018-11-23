package com.oj.string;

public class P14_Longest_Common_Prefix {
	public String longestCommonPrefix(String[] strs) {
        StringBuilder sbStr = new StringBuilder();
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        
        // Loop over first string
        for (int i = 0; i < strs[0].length(); i++) {
            // Loop over other strings at char i
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return sbStr.toString();
                }                
            }
            // Found char i in all strings
            sbStr.append(strs[0].charAt(i));
        }
        // Found all chars in strs[0]
        return strs[0];
    }
}
