package com.peige.test;

import java.util.Arrays;

import com.peige.algo._21_ReorderArray;

public class _21_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 */
	private static void test1() {
		int[] array1 = {1,2,3,4,5};
		_21_ReorderArray.reOrderArray(array1);
		printArray(array1);
		
		int[] array2 = {1,2,1,4,5,6,3};
		_21_ReorderArray.reOrderArray(array2);
		printArray(array2);
	}
	
	/**
	 * 边界测试
	 * 1.全是偶数
	 * 2.全是奇数
	 * 3.只有一个元素
	 */
	private static void test2() {
		int[] array1 = {2,2,2,2};
		_21_ReorderArray.reOrderArray(array1);
		printArray(array1);
		
		int[] array2 = {3,3,3,3,3};
		_21_ReorderArray.reOrderArray(array2);
		printArray(array2);
		
		int[] array3 = {1};
		_21_ReorderArray.reOrderArray(array3);
		printArray(array3);
	}
	
	/**
	 * 极端测试
	 */
	private static void test3() {
		int[] array1 = null;
		_21_ReorderArray.reOrderArray(array1);
		printArray(array1);
		
		int[] array2 = new int[0];
		_21_ReorderArray.reOrderArray(array2);
		printArray(array2);
	}
	
	private static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}









