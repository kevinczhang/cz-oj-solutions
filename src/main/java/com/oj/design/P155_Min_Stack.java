package com.oj.design;

import java.util.Stack;

public class P155_Min_Stack {
	Stack<Integer> stack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public P155_Min_Stack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int x) {
        this.stack.push(x);
        if (this.minStack.isEmpty() || this.minStack.peek() >= x) {
            this.minStack.push(x);
        }
    }
    
    public void pop() {
    	if (this.stack.isEmpty()) {
    		return;
    	}
        if (this.stack.peek().equals(this.minStack.peek())) {
            this.minStack.pop();
        }
        this.stack.pop();
    }
    
    public int top() {
    	if(this.stack.isEmpty())
			throw new IndexOutOfBoundsException();
        return this.stack.peek();
    }
    
    public int getMin() {
    	if(this.minStack.isEmpty())
			return -1;
        return this.minStack.peek();
    }
}
