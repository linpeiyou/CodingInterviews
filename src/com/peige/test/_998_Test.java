package com.peige.test;

import com.peige.algo._998_JumpFloorII;

public class _998_Test {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	/**
	 * 功能测试
	 */
	private static void test1() {
		for(int i = 1; i < 10; ++i) {
			System.out.println(_998_JumpFloorII.JumpFloorII(i));
		}
		System.out.println();
		System.out.println();
	}
	
	/**
	 * 极端测试
	 */
	private static void test2() {
		int i = _998_JumpFloorII.JumpFloorII(0);
		System.out.println(i);
		i = _998_JumpFloorII.JumpFloorII(-1);
		System.out.println(i);
	}
	
}
