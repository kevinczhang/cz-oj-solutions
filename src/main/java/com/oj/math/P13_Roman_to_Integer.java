package com.oj.math;

import java.util.HashMap;
import java.util.Map;

public class P13_Roman_to_Integer {
	public int romanToInt(String s) {
        Map<Character, Integer> romanIntMap = new HashMap<>();
        romanIntMap.put('I', 1);
        romanIntMap.put('V', 5);
        romanIntMap.put('X', 10);
        romanIntMap.put('L', 50);
        romanIntMap.put('C', 100);
        romanIntMap.put('D', 500);
        romanIntMap.put('M', 1000);
        
        int res = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            int curInt = romanIntMap.get(s.charAt(i));
            if (i - 1 < 0) {
                res += curInt;
                break;
            }
            int prevInt = romanIntMap.get(s.charAt(i - 1));
            if (prevInt < curInt) {
                res += curInt - prevInt;
                i -= 2;
            } else {
                res += curInt;
                i--;
            }
            
        }
        return res;
    }
}
