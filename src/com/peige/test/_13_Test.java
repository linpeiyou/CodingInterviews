package com.peige.test;

import com.peige.algo._13_RobotMove;

public class _13_Test {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 * 0,0  0,1  0,2  0,3
	 * 1,0  1,1  1,2  1,3
	 * 2,0  2,1  2,2  2,3 
	 */
	private static void test1() {
		_13_RobotMove rm = new _13_RobotMove();
		int res = rm.movingCount(3, 3, 4);
		MyTest.equal(res, 9);
	}
	
	/**
	 * 边界值测试
	 * 1.只有一行
	 * 2.只有一列
	 * 3.k等于0
	 */
	private static void test2() {
		_13_RobotMove rm = new _13_RobotMove();
		// 0-9, 10-18
		int res = rm.movingCount(9, 30, 1);
		MyTest.equal(res, 19);
		
		// 0-9, 10-18
		res = rm.movingCount(9, 1, 30);
		MyTest.equal(res, 19);
		
		res = rm.movingCount(0, 2, 4);
		MyTest.equal(res, 1);
	}

	/**
	 * 特殊输入测试
	 */
	private static void test3() {
		_13_RobotMove rm = new _13_RobotMove();
		int res = rm.movingCount(-1, 4, 4);
		MyTest.equal(res, 0);
	}
	
	
	
	
	
	
}








