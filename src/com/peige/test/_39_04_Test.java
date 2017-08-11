package com.peige.test;

import com.peige.algo._39_MoreThanHalfNumber_04;

public class _39_04_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 * 1.存在
	 * 2.不存在
	 */
	private static void test1() {
		_39_MoreThanHalfNumber_04 m = new _39_MoreThanHalfNumber_04();
		int res = m.MoreThanHalfNum_Solution(new int[] {2,4,1,3,4,4,1,4,4,6,4});
		MyTest.equal(res, 4);
		
		res = m.MoreThanHalfNum_Solution(new int[] {2,4,1,3,4,4,1,4,4,6});
		MyTest.equal(res, 0);
	}
	
	/**
	 * 边界测试
	 * 1.只有一个元素
	 */
	private static void test2() {
		_39_MoreThanHalfNumber_04 m = new _39_MoreThanHalfNumber_04();
		int res = m.MoreThanHalfNum_Solution(new int[] {2});
		MyTest.equal(res, 2);
	}
	
	/**
	 * 极端测试
	 * 1.输入null
	 * 2.输入数组长度为0
	 */
	private static void test3() {
		_39_MoreThanHalfNumber_04 m = new _39_MoreThanHalfNumber_04();
		int res = m.MoreThanHalfNum_Solution(null);
		MyTest.equal(res, 0);

		res = m.MoreThanHalfNum_Solution(new int[0]);
		MyTest.equal(res, 0);
	}
	
}


