package com.peige.test;

import com.peige.algo._12_StringPathInMatrix;

public class _12_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * a  b  t  g
	 * c  f  c  s
	 * j  d  e  h
	 * 
	 * 是否包含bfce: true 
	 * 是否包含abfb: false
	 */
	private static void test1() {
		_12_StringPathInMatrix spim = new _12_StringPathInMatrix();
		char[] matrix = { 'a', 'b', 't', 'g',
				'c', 'f', 'c', 's', 
				'j', 'd', 'e', 'h'};
		int rows = 3;
		int cols = 4;
		boolean result1 = spim.hasPath(matrix, rows, cols, new char[] {'b','f','c','e'});
		MyTest.equal(result1, true);
		
		boolean result2 = spim.hasPath(matrix, rows, cols, new char[] {'a','b','f','b'});
		MyTest.equal(result2, false);
	}
	
	/**
	 * 极端值测试
	 * 1.matrix数组大小为0
	 * 2.str数组大小为0 
	 * 3.matrix为null
	 * 4.str为null
	 */
	private static void test2() {
		_12_StringPathInMatrix spim = new _12_StringPathInMatrix();
		char[] matrix1 = new char[0];
		boolean result1 = spim.hasPath(matrix1, 0, 0, new char[] {'1'}); 
		MyTest.equal(result1, false);

		char[] matrix2 = new char[] {'h','h','h','h'};
		boolean result2 = spim.hasPath(matrix2, 2, 2, new char[0]); 
		MyTest.equal(result2, false);
		
		boolean result3 = spim.hasPath(null, 0, 0, new char[0]); 
		MyTest.equal(result3, false);

		char[] matrix4 = new char[] {'h','h','h','h'};;
		boolean result4 = spim.hasPath(matrix4, 2, 2, null); 
		MyTest.equal(result4, false);
	}
	
	/**
	 * 边界测试
	 * 1.只有一行
	 * 2.只有一列
	 * 3.矩阵所有字母一样
	 */
	private static void test3() {
		_12_StringPathInMatrix spim = new _12_StringPathInMatrix();
		char[] matrix1 = {'1','2','3','4'};
		boolean result1 = spim.hasPath(matrix1, 4, 1, new char[] {'4','3','2','1'}); 
		MyTest.equal(result1, true);
		
		char[] matrix2 = {'1','2','3','4'};
		boolean result2 = spim.hasPath(matrix2, 1, 4, new char[] {'2','3','4'}); 
		MyTest.equal(result2, true);
		
		char[] matrix3 = {'a','a','a', 'a','a','a', 'a','a','a'};
		boolean result3 = spim.hasPath(matrix3, 3, 3, new char[]{'a','a','a', 'a','a','a', 'a','a','a'}); 
		MyTest.equal(result3, true);
	}
}
















