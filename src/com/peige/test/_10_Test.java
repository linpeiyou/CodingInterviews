package com.peige.test;

import com.peige.algo._10_Fibonacci;

public class _10_Test {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	/**
	 * 功能测试 && 边界值测试
	 */
	private static void test1() {
		for(int i = 0; i < 10; ++i) {
			System.out.print(_10_Fibonacci.Fibonacci(i) + " ");
		}
		System.out.println();
	}
	
	/**
	 * 性能测试
	 */
	private static void test2() {
		System.out.println(_10_Fibonacci.Fibonacci(20));
		System.out.println(_10_Fibonacci.Fibonacci(39));
	}
}
