package com.oj.math;

import java.util.ArrayList;
import java.util.List;

public class P412_Fizz_Buzz {
	public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            String val = "";
            if (i % 3 == 0) {
                val += "Fizz";
            }
            if (i % 5 == 0) {
                val += "Buzz";
            }
            if (val.length() == 0) {
                res.add(String.valueOf(i));
            } else {
                res.add(val);
            }            
        }
        return res;
    }
}
