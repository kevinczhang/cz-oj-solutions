package com.oj.other;

import java.util.ArrayList;
import java.util.List;

public class P118_Pascal_Triangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) return res;
        
        List<Integer> curRow = new ArrayList<>();
        curRow.add(1);        
        int i = 1;
        
        while (i <= numRows) {
            List<Integer> nextRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    nextRow.add(1);
                } else {
                    nextRow.add(curRow.get(j) + curRow.get(j - 1));
                }                
            }
            res.add(new ArrayList<>(curRow));
            curRow = nextRow;
            i++;
        }
        return res;
    }
}
