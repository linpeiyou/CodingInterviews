package com.peige.test;

import com.peige.algo._43_NumberOf1;

public class _43_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 */
	private static void test1() {
		int res = _43_NumberOf1.NumberOf1Between1AndN_Solution(21305);
		MyTest.equal(res, 18767);
		
		res = _43_NumberOf1.NumberOf1Between1AndN_Solution(12);
		MyTest.equal(res, 5);
	}
	
	/**
	 * 边界测试
	 * 1.输入1
	 */
	private static void test2() {
		int res = _43_NumberOf1.NumberOf1Between1AndN_Solution(1);
		MyTest.equal(res, 1);
	}
	
	/**
	 * 极端测试
	 * 1.输入0
	 * 2.输入负数
	 */
	private static void test3() {
		int res = _43_NumberOf1.NumberOf1Between1AndN_Solution(0);
		MyTest.equal(res, 0);
		
		res = _43_NumberOf1.NumberOf1Between1AndN_Solution(-2);
		MyTest.equal(res, 0);
	}
	
}
