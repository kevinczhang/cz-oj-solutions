package com.oj.sortingAndSearching;

public class P278_First_Bad_Version {
	public int firstBadVersion(int n) {
		int start = 1;
        int end = n;
        
        while (end > start) {
        	// This is critical
            int mid = start + (end - start) / 2; 
            
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        
        return start;
    }

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
