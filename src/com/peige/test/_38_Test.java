package com.peige.test;

import com.peige.algo._38_StringPermutation;

public class _38_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 * 1.有重复字符
	 * 2.无重复字符
	 */
	private static void test1() {
		_38_StringPermutation sp = new _38_StringPermutation();
		System.out.println(sp.Permutation("abc"));
		System.out.println(sp.Permutation("aAb"));
		System.out.println(sp.Permutation("aabc"));
	}
	
	/**
	 * 边界测试
	 * 1.只有一个字符
	 * 2.有多个重复字符
	 */
	private static void test2() {
		_38_StringPermutation sp = new _38_StringPermutation();
		System.out.println(sp.Permutation("a"));
		System.out.println(sp.Permutation("aaa"));
		System.out.println(sp.Permutation("aabb"));
	}
	
	/**
	 * 极端测试
	 * 1.输入null
	 * 2.输入的字符串内容为空
	 */
	private static void test3() {
		_38_StringPermutation sp = new _38_StringPermutation();
		System.out.println(sp.Permutation(null));
		System.out.println(sp.Permutation(""));
	}
}















