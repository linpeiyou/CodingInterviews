package com.peige.test;

import com.peige.algo._997_StringCombination;

public class _997_Test {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	/**
	 * 功能测试
	 */
	private static void test1() {
		_997_StringCombination sc = new _997_StringCombination();
		System.out.println(sc.stringCombination("abc"));
		System.out.println(sc.stringCombination("abcd"));
		System.out.println(sc.stringCombination("aabb"));
	}
	
	/**
	 * 边界测试
	 */
	private static void test2() {
		_997_StringCombination sc = new _997_StringCombination();
		System.out.println(sc.stringCombination("a"));
		System.out.println(sc.stringCombination("aaa"));
	}
	
	/**
	 * 极端测试
	 */
	private static void test3() {
		_997_StringCombination sc = new _997_StringCombination();
		System.out.println(sc.stringCombination(""));
		System.out.println(sc.stringCombination(null));
	}
	
}











