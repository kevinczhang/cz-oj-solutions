package com.oj.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class P350_Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = new HashMap<>();
        
        for (int num : nums1) {
            if (nums1Map.containsKey(num)) {
                nums1Map.put(num, nums1Map.get(num) + 1);
            } else {
                nums1Map.put(num, 1);
            }
        }
        
        List<Integer> resList = new ArrayList<>();
        for (int num : nums2) {
            if (nums1Map.containsKey(num)) {
                resList.add(num);
                if (nums1Map.get(num) == 1) {
                    nums1Map.remove(num);
                } else {
                    nums1Map.put(num, nums1Map.get(num) - 1);
                }
            }
        }
        
        int[] res = new int[resList.size()];
        int i = 0;
        while ( i < resList.size()) {
        	res[i] = resList.get(i++);        	
        }
        
        res = resList.stream().flatMapToInt(x -> IntStream.of(x)).toArray();
        
        return res;
        
    }
}
