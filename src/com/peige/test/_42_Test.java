package com.peige.test;

import com.peige.algo._42_GreatestSumOfSubarrays;

public class _42_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 */
	private static void test1() {
		int res = _42_GreatestSumOfSubarrays.
				FindGreatestSumOfSubArray(new int[] {1,-2,1,3,4,-2,5,-1});
		MyTest.equal(res, 11);
	}

	/**
	 * 边界测试
	 * 1.全正数
	 * 2.全负数
	 * 3.只有一个数
	 */
	private static void test2() {
		int res = _42_GreatestSumOfSubarrays.
				FindGreatestSumOfSubArray(new int[] {1,2,1,3});
		MyTest.equal(res, 7);

		res = _42_GreatestSumOfSubarrays.FindGreatestSumOfSubArray(new int[] {-1,-2,-1,-3});
		MyTest.equal(res, -1);
		
		res = _42_GreatestSumOfSubarrays.FindGreatestSumOfSubArray(new int[] {3});
		MyTest.equal(res, 3);
	}
	
	/**
	 * 极端测试
	 * 1.输入null
	 * 2.数组长度0
	 */
	private static void test3() {
		int res = _42_GreatestSumOfSubarrays.FindGreatestSumOfSubArray(null);
		MyTest.equal(res, 0);
		
		res = _42_GreatestSumOfSubarrays.FindGreatestSumOfSubArray(new int[0]);
		MyTest.equal(res, 0);
	}
	
}









