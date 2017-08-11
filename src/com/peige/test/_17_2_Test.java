package com.peige.test;

import com.peige.algo._17_Print1ToMaxOfNDigits_2;

public class _17_2_Test {
	
	public static void main(String[] args) {
		test1();
		test2();
	}
	
	private static void test1() {
		_17_Print1ToMaxOfNDigits_2.Print1ToMaxOfNDigits_2(1);
		System.out.println();
		_17_Print1ToMaxOfNDigits_2.Print1ToMaxOfNDigits_2(2);
		System.out.println();
		_17_Print1ToMaxOfNDigits_2.Print1ToMaxOfNDigits_2(3);
		System.out.println();
		System.out.println();
	}
	
	private static void test2() {
		_17_Print1ToMaxOfNDigits_2.Print1ToMaxOfNDigits_2(0);
		System.out.println();
		_17_Print1ToMaxOfNDigits_2.Print1ToMaxOfNDigits_2(-1);
		System.out.println();
	}
}
