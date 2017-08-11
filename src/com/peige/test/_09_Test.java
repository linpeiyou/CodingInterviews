package com.peige.test;

import com.peige.algo._09_QueueWithTwoStacks;

public class _09_Test {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	/**
	 * 往空的队列里添加、删除元素
	 */
	private static void test1() {
		_09_QueueWithTwoStacks q = new _09_QueueWithTwoStacks();
		q.push(1);
		q.pop();
	}
	
	/**
	 * 往非空的队列里面添加、删除元素
	 */
	private static void test2() {
		_09_QueueWithTwoStacks q = new _09_QueueWithTwoStacks();
		for(int i = 0; i < 5; ++i) {
			q.push(i);
		}
		for(int i = 0; i < 5; ++i) {
			System.out.print(q.pop() + " ");
		}
		System.out.println();
	}
	
}
