package com.peige.test;

import com.peige.algo._53_01_NumberOfK;

public class _53_01_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		int[] arr = new int[] {1,2,2,3,3,3,3,3,4,4,4,5,5,6,7,8};
		_53_01_NumberOfK nok = new _53_01_NumberOfK();
		int n = nok.GetNumberOfK(arr, 3);
		MyTest.equal(n, 5);
		
		n = nok.GetNumberOfK(arr, 4);
		//System.out.println(n);
		MyTest.equal(n, 3);
		
		n = nok.GetNumberOfK(arr, 5);
		//System.out.println(n);
		MyTest.equal(n, 2);
		
		n = nok.GetNumberOfK(arr, 6);
		MyTest.equal(n, 1);
		
		n = nok.GetNumberOfK(arr, 11);
		MyTest.equal(n, 0);
	}
	
	private static void test2() {
		int[] arr = new int[] {1};
		_53_01_NumberOfK nok = new _53_01_NumberOfK();
		int n = nok.GetNumberOfK(arr, 3);
		MyTest.equal(n, 0);
		
		n = nok.GetNumberOfK(arr, 1);
		MyTest.equal(n, 1);
	}
	
	private static void test3() {
		_53_01_NumberOfK nok = new _53_01_NumberOfK();
		int n = nok.GetNumberOfK(new int[0], 1);
		MyTest.equal(n, 0);
		
		n = nok.GetNumberOfK(null, 1);
		MyTest.equal(n, 0);
	}
}










