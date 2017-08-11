package com.peige.test;

import com.peige.algo._30_MinInStack;

public class _30_Test {

	public static void main(String[] args) {
		test1();
	}

	/**
	 * 1.新压入栈的数字比之前的最小值大
	 * 2.新压入栈的数字比之前的最小值小
	 * 3.弹出栈的数字不是最小元素
	 * 4.弹出栈的数字是最小元素
	 */
	private static void test1() {
		_30_MinInStack mis = new _30_MinInStack();
		mis.push(4);
		mis.push(5);
		mis.push(6);
		MyTest.equal(mis.top(), 6);
		MyTest.equal(mis.min(), 4);
		
		mis.pop();
		mis.pop();
		MyTest.equal(mis.top(), 4);
		MyTest.equal(mis.min(), 4);
		
		mis.push(2);
		MyTest.equal(mis.top(), 2);
		MyTest.equal(mis.min(), 2);
		
		mis.pop();
		MyTest.equal(mis.top(), 4);
		MyTest.equal(mis.min(), 4);
	}
}
