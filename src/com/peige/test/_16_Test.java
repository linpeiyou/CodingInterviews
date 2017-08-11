package com.peige.test;

import com.peige.algo._16_Power;

public class _16_Test {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	/**
	 * 功能测试
	 * 1.正数次方
	 * 2.负数次方
	 */
	private static void test1() {
		_16_Power power = new _16_Power();
		double res = power.Power(1.1, 2);
		MyTest.equal(res, 1.21);
		
		res = power.Power(3, 3);
		MyTest.equal(res, 27);
		
		res = power.Power(-2, 3);
		MyTest.equal(res, -8);
		
		res = power.Power(5, -2);
		MyTest.equal(res, 0.04);
		
		res = power.Power(-2, -3);
		MyTest.equal(res, -0.125);
	}
	
	/**
	 * 边界测试
	 * 1.base为0
	 * 2.exponent为0
	 */
	private static void test2() {
		_16_Power power = new _16_Power();
		double res = power.Power(0, 5);
		MyTest.equal(res, 0);

		res = power.Power(3, 0);
		MyTest.equal(res, 1);
	}
}
