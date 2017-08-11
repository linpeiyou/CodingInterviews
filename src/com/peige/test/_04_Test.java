package com.peige.test;

import com.peige.algo._04_FindInPartiallySortedMatrix;

public class _04_Test {

	public static void main(String[] args) {
		int[][] array = {
				{ 1,2,8,9 },
				{ 2,4,9,12 },
				{ 4,7,10,13 },
				{ 6,8,11,15 } 
		};
		test1(array);
		test2(array);
		test3();
	}
	
	/**
	 * 二维数组中包含查找的数字
	 * 1.查找的数字是数组中最大值
	 * 2.查找的数字是数组中最小值
	 * 3.查找的数字介于数组中的最大值和最小值之间
	 */
	private static void test1(int[][] array) {
		boolean isFind = _04_FindInPartiallySortedMatrix.Find(1, array);
		MyTest.equal(isFind, true);
		isFind = _04_FindInPartiallySortedMatrix.Find(15, array);
		MyTest.equal(isFind, true);
		isFind = _04_FindInPartiallySortedMatrix.Find(10, array);
		MyTest.equal(isFind, true);
	}
	
	/**
	 * 二维数组中没有查找的数字
	 * 1.查找的数字大于数组中的最大值
	 * 2.查找的数字小于数组中的最小值
	 * 3.查找的数字在数组中的最大值和最小值之间但数组没有这个数字
	 */
	private static void test2(int[][] array) {
		boolean isFind = _04_FindInPartiallySortedMatrix.Find(0, array);
		MyTest.equal(isFind, false);
		isFind = _04_FindInPartiallySortedMatrix.Find(16, array);
		MyTest.equal(isFind, false);
		isFind = _04_FindInPartiallySortedMatrix.Find(5, array);
		MyTest.equal(isFind, false);
	}
	
	/**
	 * 特殊输入测试，输入空数组
	 */
	private static void test3() {
		int[][] arr = new int[0][0];
		boolean isFind = _04_FindInPartiallySortedMatrix.Find(1, arr);
		MyTest.equal(isFind, false);
	}
}














