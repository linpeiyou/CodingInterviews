package com.peige.test;

import java.util.Arrays;

import com.peige.algo._66_ConstructArray;

public class _66_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		int[] result = _66_ConstructArray.multiply(new int[] {1,2,3,4});
		MyTest.equal(result, new int[] {24, 12, 8, 6});
	}
	
	private static void test2() {
		int[] result = _66_ConstructArray.multiply(new int[] {2,2,2,2});
		MyTest.equal(result, new int[] {8,8,8,8});
		
		result = _66_ConstructArray.multiply(new int[] {5});
		MyTest.equal(result, new int[] {1});
	}
	
	private static void test3() {
		int[] result = _66_ConstructArray.multiply(null);
		System.out.println(result);
		
		result = _66_ConstructArray.multiply(new int[] {});
		System.out.println(Arrays.toString(result));
	}
}













