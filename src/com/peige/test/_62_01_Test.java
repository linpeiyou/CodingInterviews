package com.peige.test;

import com.peige.algo._62_LastNumberInCircle_01;

public class _62_01_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		int result = _62_LastNumberInCircle_01.LastRemaining_Solution(5, 3);
		MyTest.equal(result, 3);
		
		result = _62_LastNumberInCircle_01.LastRemaining_Solution(3, 4);
		MyTest.equal(result, 1);
	}
	
	private static void test2() {
		int result = _62_LastNumberInCircle_01.LastRemaining_Solution(3, 1);
		MyTest.equal(result, 2);

		result = _62_LastNumberInCircle_01.LastRemaining_Solution(1, 1);
		MyTest.equal(result, 0);
	}
	
	private static void test3() {
		int result = _62_LastNumberInCircle_01.LastRemaining_Solution(3, -1);
		MyTest.equal(result, -1);
		
		result = _62_LastNumberInCircle_01.LastRemaining_Solution(0, 1);
		MyTest.equal(result, -1);
	}
	
}












