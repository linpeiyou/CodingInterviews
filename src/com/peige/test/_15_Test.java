package com.peige.test;

import com.peige.algo._15_NumberOf1InBinary;

public class _15_Test {
	
	public static void main(String[] args) {
		test1();
		test2();
	}
	
	/**
	 * 功能测试
	 */
	private static void test1() {
		int count = _15_NumberOf1InBinary.NumberOf1(5);
		MyTest.equal(count, 2);
		
		count = _15_NumberOf1InBinary.NumberOf1(-65);
		MyTest.equal(count, 31);
	}
	
	/**
	 * 边界测试
	 * 1. Integer.MAX_VALUE
	 * 2. Integer.MIN_VALUE
	 * 3. 0
	 * 4. 1
	 * 5. -1
	 */
	private static void test2() {
		int count = _15_NumberOf1InBinary.NumberOf1(Integer.MAX_VALUE);
		MyTest.equal(count, 31);
		
		count = _15_NumberOf1InBinary.NumberOf1(Integer.MIN_VALUE);
		MyTest.equal(count, 1);
		
		count = _15_NumberOf1InBinary.NumberOf1(0);
		MyTest.equal(count, 0);
		
		count = _15_NumberOf1InBinary.NumberOf1(1);
		MyTest.equal(count, 1);
		
		count = _15_NumberOf1InBinary.NumberOf1(-1);
		MyTest.equal(count, 32);
	}
	
}


















