package com.peige.test;

import com.peige.algo._57_01_TwoNumbersWithSum;

public class _57_01_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		int[] array = new int[] {1,2,3,4,4,5,6,7,8,9};
		_57_01_TwoNumbersWithSum tnws = new _57_01_TwoNumbersWithSum();
		// 1,9
		System.out.println(tnws.FindNumbersWithSum(array, 10));
		
		// 1,8
		System.out.println(tnws.FindNumbersWithSum(array, 9));
		
		// 1,5
		System.out.println(tnws.FindNumbersWithSum(array, 6));
	}
	
	private static void test2() {
		int[] array = new int[] {1,2};
		_57_01_TwoNumbersWithSum t = new _57_01_TwoNumbersWithSum();
		System.out.println(t.FindNumbersWithSum(array, 3));
	}
	
	/**
	 * 极端测试
	 * 1.数组为null
	 * 2.数组长度小于2
	 * 3.数组里没有符合的元素
	 */
	private static void test3() {
		_57_01_TwoNumbersWithSum t = new _57_01_TwoNumbersWithSum();
		// null
		System.out.println(t.FindNumbersWithSum(null, 1));
		
		// null
		System.out.println(t.FindNumbersWithSum(new int[1], 1));
		
		// null
		System.out.println(t.FindNumbersWithSum(new int[] {1,2,3,4}, 8));
	}
}

















