package com.peige.algo;

import java.util.Stack;

public class _09_QueueWithTwoStacks {

	Stack<Integer> stack1 = new Stack<>();	// 用来push
	Stack<Integer> stack2 = new Stack<>();	// 用来pop
	
	public void push(int node) {
		stack1.push(node);
	}
	
	public int pop() {
		if(stack2.empty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		
		if(stack2.empty())
			throw new RuntimeException("Queue is empty!");
		
		return stack2.pop();
	}
}
