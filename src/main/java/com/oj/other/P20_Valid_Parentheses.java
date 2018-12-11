package com.oj.other;

import java.util.Stack;

public class P20_Valid_Parentheses {
	public boolean isValid(String s) {
        Stack<Character> pairs = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (pairs.isEmpty()) {
                pairs.push(s.charAt(i));
            } else if (pairs.peek() == '(' && s.charAt(i) == ')' ||
               pairs.peek() == '[' && s.charAt(i) == ']' ||
               pairs.peek() == '{' && s.charAt(i) == '}') {
                pairs.pop();
            } else {
                pairs.push(s.charAt(i));
            }            
        }
        return pairs.isEmpty();
    }
}
