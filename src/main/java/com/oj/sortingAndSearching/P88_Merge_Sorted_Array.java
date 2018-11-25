package com.oj.sortingAndSearching;

public class P88_Merge_Sorted_Array {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind = m + n - 1;
        while (m > 0 || n > 0) {
            if (n == 0) {
                return;
            }
            if (m == 0) {
                nums1[ind--] = nums2[n - 1];
                n--;
            } else if (nums1[m - 1] > nums2[n - 1]) {
                nums1[ind--] = nums1[m - 1];
                m--;
            } else {
                nums1[ind--] = nums2[n - 1];
                n--;
            }
        }
    }
}
