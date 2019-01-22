package com.cz.oj.sortingandsearching;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class P347_Top_K_Frequent_Elements {
	public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numToCount = new HashMap<>();
        for (int num : nums) {
        	if (numToCount.containsKey(num)) {
        		numToCount.put(num, numToCount.get(num) + 1);
        	} else {
        		numToCount.put(num, 1);
        	}
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = 
        		new PriorityQueue<>((s1, s2)-> s1.getValue() - s2.getValue());
        
        for(Map.Entry<Integer, Integer> entry : numToCount.entrySet()) {
        	if (pq.size() < k) {
        		pq.add(entry);
        	} else if (pq.peek().getValue() < entry.getValue()) {
        		pq.poll();
        		pq.add(entry);
        	}
        }        
        
        return pq.stream().map(x -> x.getKey()).collect(Collectors.toList());
    }
}
