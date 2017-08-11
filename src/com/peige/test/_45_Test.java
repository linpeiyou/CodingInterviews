package com.peige.test;

import com.peige.algo._45_SortArrayForMinNumber;

public class _45_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		String s = _45_SortArrayForMinNumber.PrintMinNumber(new int[] {12, 123, 1});
		MyTest.equal(s, "112123");
		
		s = _45_SortArrayForMinNumber.PrintMinNumber(new int[] {43, 3, 134});
		MyTest.equal(s, "134343");
		
		s = _45_SortArrayForMinNumber.PrintMinNumber(new int[] {43, 4});
		MyTest.equal(s, "434");
		
		s = _45_SortArrayForMinNumber.PrintMinNumber(new int[] {45, 4});
		MyTest.equal(s, "445");
	}
	
	private static void test2() {
		String s = _45_SortArrayForMinNumber.PrintMinNumber(new int[] {4});
		MyTest.equal(s, "4");
		
		s = _45_SortArrayForMinNumber.PrintMinNumber(new int[] {1,111,1111});
		MyTest.equal(s, "11111111");
	}
	
	private static void test3() {
		String s = _45_SortArrayForMinNumber.PrintMinNumber(null);
		MyTest.equal(s, "");
		
		s = _45_SortArrayForMinNumber.PrintMinNumber(new int[0]);
		MyTest.equal(s, "");
	}
	
}










