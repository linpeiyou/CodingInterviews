package com.peige.test;

import com.peige.algo._29_PrintMatrix;

public class _29_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 数组有多行多列
	 */
	private static void test1() {
		_29_PrintMatrix pm = new _29_PrintMatrix();
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		System.out.println(pm.printMatrix(arr));
		
		arr = new int[][]{
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
				{13,14,15}
		};
		System.out.println(pm.printMatrix(arr));
	}
	
	/**
	 * 边界测试
	 * 1.数组只有一行
	 * 2.数组只有一列
	 * 3.数组只有一行一列
	 */
	private static void test2() {
		_29_PrintMatrix pm = new _29_PrintMatrix();
		System.out.println(pm.printMatrix(new int[][] {{1,2,3,4}}));
		System.out.println(pm.printMatrix(new int[][] {{1}, {2}, {3}, {4}}));
		System.out.println(pm.printMatrix(new int[][] {{1}}));
	}
	
	/**
	 * 极端测试
	 * 1.二维数组为null
	 * 2.二维数组第一维度有0个元素
	 * 4.二维数组第二维度为null
	 * 3.二维数组第二维度为0个元素
	 */
	private static void test3() {
		_29_PrintMatrix pm = new _29_PrintMatrix();
		System.out.println(pm.printMatrix(null));
		
		System.out.println(pm.printMatrix(new int[0][]));
		
		System.out.println(pm.printMatrix(new int[6][]));
		
		System.out.println(pm.printMatrix(new int[3][0]));
	}
	
}















