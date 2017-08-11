package com.peige.test;

import com.peige.algo._999_JumpFloor;

public class _999_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 */
	private static void test1() {
		for(int i = 1; i <= 10; ++i) {
			System.out.print(_999_JumpFloor.JumpFloor(i) + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	/**
	 * 性能测试
	 */
	private static void test2() {
		int i = _999_JumpFloor.JumpFloor(20);
		System.out.println(i);
		i = _999_JumpFloor.JumpFloor(40);
		System.out.println(i);
		System.out.println();
	}
	
	/**
	 * 极端测试
	 */
	private static void test3() {
		int i = _999_JumpFloor.JumpFloor(-5);
		System.out.println(i);
		i = _999_JumpFloor.JumpFloor(0);
		System.out.println(i);
		System.out.println();
	}
}
