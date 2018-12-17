package com.cz.oj.arrayandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P49_Group_Anagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> signToAnag = new HashMap<>();
        for (String str : strs) {
            char[] sortedChars = str.toCharArray();
            Arrays.sort(sortedChars);
            String sign = String.valueOf(sortedChars);
            List<String> list = new ArrayList<>();
            if (signToAnag.containsKey(sign)){
                list = signToAnag.get(sign);
            }
            list.add(str);
            signToAnag.put(sign, list);
        }
        for (Map.Entry<String, List<String>> entry : signToAnag.entrySet()) {
            res.add(entry.getValue());
        }
        return res;
    }
}
