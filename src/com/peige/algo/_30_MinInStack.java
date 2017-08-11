package com.peige.algo;

import java.util.Stack;

public class _30_MinInStack {

	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> minStack = new Stack<>();
	
    public void push(int node) {
        stack.push(node);
        if(minStack.isEmpty()) {
        	minStack.push(node);
        }
        else if(minStack.peek() > node) {
        	minStack.push(node);
        }
        else {
        	minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}
