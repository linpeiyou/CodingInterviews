package com.peige.test;

import com.peige.algo._51_InversePairs;

public class _51_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 5,6,3,2
	 */
	private static void test1() {
		_51_InversePairs ip = new _51_InversePairs();
		int n = ip.InversePairs(new int[] {5,6,3,2});
		MyTest.equal(n, 5);
		
		n = ip.InversePairs(new int[] {4,2,3,4});
		MyTest.equal(n, 2);
		
		n = ip.InversePairs(new int[] {6,6,4,2,1,7});
		MyTest.equal(n, 9);
	}
	
	/**
	 * 边界
	 */
	private static void test2() {
		_51_InversePairs ip = new _51_InversePairs();
		int n = ip.InversePairs(new int[] {1,2,3,4});
		MyTest.equal(n, 0);
		
		n = ip.InversePairs(new int[] {4,3,2,1});
		MyTest.equal(n, 6);
		
		n = ip.InversePairs(new int[] {1});
		MyTest.equal(n, 0);
	}
	
	/**
	 * 极端
	 */
	private static void test3() {
		_51_InversePairs ip = new _51_InversePairs();
		int n = ip.InversePairs(new int[0]);
		MyTest.equal(n, 0);
		
		n = ip.InversePairs(null);
		MyTest.equal(n, 0);
	}
	
}











