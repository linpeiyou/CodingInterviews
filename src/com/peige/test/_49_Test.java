package com.peige.test;

import com.peige.algo._49_UglyNumber;

public class _49_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		_49_UglyNumber un = new _49_UglyNumber();
		MyTest.equal(4, un.GetUglyNumber_Solution(4));
		MyTest.equal(10, un.GetUglyNumber_Solution(9));
	}
	
	private static void test2() {
		_49_UglyNumber un = new _49_UglyNumber();
		MyTest.equal(1, un.GetUglyNumber_Solution(1));
	}
	
	
	private static void test3() {
		_49_UglyNumber un = new _49_UglyNumber();
		MyTest.equal(0, un.GetUglyNumber_Solution(-1));
		MyTest.equal(0, un.GetUglyNumber_Solution(0));
	}
}





