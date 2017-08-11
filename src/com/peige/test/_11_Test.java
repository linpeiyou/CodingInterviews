package com.peige.test;

import com.peige.algo._11_MinNumberInRotatedArray;

public class _11_Test {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	/**
	 * 功能测试 
	 * Rotated: {1,2,3,4,5,6} -> {3,4,5,6,1,2}
	 * Rotated: {1,2,3,4,5,6} -> {5,6,1,2,3,4}
	 * Rotated: {0,1,1,1,1}  ->  {1,1,0,1,1}
	 */
	private static void test1() {
		int[] arr1 = {3,4,5,6,1,2};
		int min1 = _11_MinNumberInRotatedArray.minNumberInRotateArray(arr1);
		MyTest.equal(min1, 1);
		
		int[] arr2 = {5,6,1,2,3,4};
		int min2 = _11_MinNumberInRotatedArray.minNumberInRotateArray(arr2);
		MyTest.equal(min2, 1);
		
		int[] arr3 = {1,1,0,1,1};
		int min3 = _11_MinNumberInRotatedArray.minNumberInRotateArray(arr3);
		MyTest.equal(min3, 0);
	}
	
	/**
	 * 边界值测试 
	 * 1.没有rotate: {1,2,3,4,5}
	 * 2.只有一个数：{1}
	 * 3.所有元素都一样：{1,1,1,1}
	 */
	private static void test2() {
		int[] arr1 = {2,1};
		int min1 = _11_MinNumberInRotatedArray.minNumberInRotateArray(arr1);
		MyTest.equal(min1, 1);
		
		int[] arr2 = {1};
		int min2 = _11_MinNumberInRotatedArray.minNumberInRotateArray(arr2);
		MyTest.equal(min2, 1);
		
		int[] arr3 = {1,1,1,1};
		int min3 = _11_MinNumberInRotatedArray.minNumberInRotateArray(arr3);
		MyTest.equal(min3, 1);
	}
}











