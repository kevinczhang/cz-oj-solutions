package com.oj.string;

public class P38_Count_and_Say {
	public String countAndSay(int n) {
		if (n == 1) return "1";
		String res = "1";
		for (int i = 1; i < n; i++) {
			res = nexStr(res);
		}
		return res;
	}
	
	public String nexStr(String numStr) {        
        int count = 1;
        int curNum = numStr.charAt(0) - '0';
        StringBuilder sbStr = new StringBuilder();
        for (int i = 1; i < numStr.length(); i++) {
        	if (curNum == numStr.charAt(i) - '0') {
        		count++;
        		continue;
        	} else {
        		sbStr.append(count);
        		sbStr.append(curNum);
        		count = 1;
        		curNum = numStr.charAt(i) - '0';
        	}
        }
        sbStr.append(count);
		sbStr.append(curNum);
		return sbStr.toString();
    }
}
