package com.peige.test;

import com.peige.algo._58_02_LeftRotateString;

public class _58_02_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		_58_02_LeftRotateString lrs = new _58_02_LeftRotateString();
		String s = lrs.LeftRotateString("abcdef", 3);
		MyTest.equal(s, "defabc");
		
		s = lrs.LeftRotateString("abcdef", 10);
		MyTest.equal(s, "efabcd");
	}
	
	private static void test2() {
		_58_02_LeftRotateString lrs = new _58_02_LeftRotateString();
		String s = lrs.LeftRotateString("a", 1);
		MyTest.equal(s, "a");
		
		s = lrs.LeftRotateString("a", 13);
		MyTest.equal(s, "a");
	}
	
	private static void test3() {
		_58_02_LeftRotateString lrs = new _58_02_LeftRotateString();
		String s = lrs.LeftRotateString("", 1);
		MyTest.equal(s, "");
		
		s = lrs.LeftRotateString(null, 1);
		System.out.println(s);
	}
}











