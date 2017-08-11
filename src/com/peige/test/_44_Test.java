package com.peige.test;

import com.peige.algo._44_DigitsInSequence;

public class _44_Test {

	public static void main(String[] args) {
		
	}
	
	/**
	 * 功能测试
	 */
	private static void test1() {
		_44_DigitsInSequence dis = new _44_DigitsInSequence();
		MyTest.equal(1, dis.digitAtIndex(10));
		MyTest.equal(4, dis.digitAtIndex(19));
		MyTest.equal(1, dis.digitAtIndex(191));
		MyTest.equal(1, dis.digitAtIndex(3000));
	}

	private static void test2() {
		
	}
	
	private static void test3() {
		
	}
}
