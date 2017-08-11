package com.peige.test;

import com.peige.algo._40_KLeastNumbers_01;

public class _40_01_Test {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 */
	private static void test1() {
		_40_KLeastNumbers_01 kn = new _40_KLeastNumbers_01();
		// 1 2 3 4
		System.out.println(kn.GetLeastNumbers_Solution(new int[] {6,4,2,1,3,5}, 4));
		// 1 2 3 
		System.out.println(kn.GetLeastNumbers_Solution(new int[] {5,3,2,1,4,6}, 3));
	}
	
	/**
	 * 边界测试
	 * 1.只有一个元素
	 * 2.有多个元素，并且全输出
	 */
	private static void test2() {
		_40_KLeastNumbers_01 kn = new _40_KLeastNumbers_01();
		// 6
		System.out.println(kn.GetLeastNumbers_Solution(new int[] {6}, 1));
		// 1 2 3 4 5 6
		System.out.println(kn.GetLeastNumbers_Solution(new int[] {5,3,2,1,4,6}, 6));
	}

	/**
	 * 极端测试
	 * 1.数组为null
	 * 2.数组长度为0
	 * 3.k <= 0
	 * 4.k超过数组长度
	 */
	private static void test3() {
		_40_KLeastNumbers_01 kn = new _40_KLeastNumbers_01();
		// []
		System.out.println(kn.GetLeastNumbers_Solution(null, 1));
		// []
		System.out.println(kn.GetLeastNumbers_Solution(new int[0], 2));
		// []
		System.out.println(kn.GetLeastNumbers_Solution(new int[] {1,2,3}, 0));
		// []
		System.out.println(kn.GetLeastNumbers_Solution(new int[] {1,2,3}, -1));
		// []
		System.out.println(kn.GetLeastNumbers_Solution(new int[] {1,2,3}, 5));
	}
	
}









