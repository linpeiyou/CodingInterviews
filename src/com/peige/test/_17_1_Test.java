package com.peige.test;

import com.peige.algo._17_Print1ToMaxOfNDigits_1;

public class _17_1_Test {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	private static void test1() {
		_17_Print1ToMaxOfNDigits_1.Print1ToMaxOfNDigits_1(1);
		System.out.println();
		_17_Print1ToMaxOfNDigits_1.Print1ToMaxOfNDigits_1(2);
		System.out.println();
		_17_Print1ToMaxOfNDigits_1.Print1ToMaxOfNDigits_1(3);
		System.out.println();
		System.out.println();
	}
	
	private static void test2() {
		_17_Print1ToMaxOfNDigits_1.Print1ToMaxOfNDigits_1(0);
		System.out.println();
		_17_Print1ToMaxOfNDigits_1.Print1ToMaxOfNDigits_1(-1);
		System.out.println();
	}
}
