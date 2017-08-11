package com.peige.test;

import com.peige.algo._65_AddTwoNumbers;

public class _65_Test {

	public static void main(String[] args) {
		test1();
	}
	
	private static void test1() {
		int res = _65_AddTwoNumbers.Add(1, 4);
		MyTest.equal(res, 5);
		
		res = _65_AddTwoNumbers.Add(1, -4);
		MyTest.equal(res, -3);
		
		res = _65_AddTwoNumbers.Add(1, 0);
		MyTest.equal(res, 1);
		
		res = _65_AddTwoNumbers.Add(-3, 0);
		MyTest.equal(res, -3);
		
		res = _65_AddTwoNumbers.Add(1000000, 99999);
		MyTest.equal(res, 1099999);

		res = _65_AddTwoNumbers.Add(1234, 54321);
		MyTest.equal(res, 55555);
	}
	
}
