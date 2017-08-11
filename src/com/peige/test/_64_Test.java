package com.peige.test;

import com.peige.algo._64_Accumulate;

public class _64_Test {
	
	public static void main(String[] args) {
		test1();
		test2();
	}
	
	private static void test1() {
		int res = _64_Accumulate.Sum_Solution(5);
		MyTest.equal(res, 15);
		
		res = _64_Accumulate.Sum_Solution(10);
		MyTest.equal(res, 55);
	}

	private static void test2() {
		int res = _64_Accumulate.Sum_Solution(1);
		MyTest.equal(res, 1);
	}
}
