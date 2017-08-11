package com.peige.test;

import com.peige.algo._67_StringToInt;

public class _67_Test {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 * 1.带符号（+-）
	 * 2.不带符号
	 */
	private static void test1() {
		_67_StringToInt sti = new _67_StringToInt();
		int result = sti.StrToInt("666");
		MyTest.equal(result, 666);
		MyTest.equal(true, sti.isValid);
		 
		result = sti.StrToInt("+666");
		MyTest.equal(result, 666);
		MyTest.equal(true, sti.isValid);
		 
		result = sti.StrToInt("-666");
		MyTest.equal(result, -666);
		MyTest.equal(true, sti.isValid);
	}
	
	/**
	 * 边界测试
	 * 1.0
	 * 2.Integer.MAX_VALUE
	 * 3.Integer.MIN_VALUE
	 */
	private static void test2() {
		_67_StringToInt sti = new _67_StringToInt();
		int result = sti.StrToInt("0");
		MyTest.equal(result, 0);
		MyTest.equal(true, sti.isValid);
		
		result = sti.StrToInt(String.valueOf(Integer.MAX_VALUE));
		MyTest.equal(result, Integer.MAX_VALUE);
		MyTest.equal(true, sti.isValid);
		
		result = sti.StrToInt(String.valueOf(Integer.MIN_VALUE));
		MyTest.equal(result, Integer.MIN_VALUE);
		MyTest.equal(true, sti.isValid);
	}
	
	/**
	 * 极端测试
	 * 1.null
	 * 2.空字符串
	 * 3.超过int表示范围
	 * 4.只带符号
	 * 5.非法表示
	 */
	private static void test3() {
		_67_StringToInt sti = new _67_StringToInt();
		int result = sti.StrToInt(null);
		MyTest.equal(result, 0);
		MyTest.equal(false, sti.isValid);
		
		result = sti.StrToInt("");
		MyTest.equal(result, 0);
		MyTest.equal(false, sti.isValid);
		
		result = sti.StrToInt("1436468468422");
		MyTest.equal(result, 0);
		MyTest.equal(false, sti.isValid);
		
		result = sti.StrToInt("+");
		MyTest.equal(result, 0);
		MyTest.equal(false, sti.isValid);
		
		result = sti.StrToInt("-");
		MyTest.equal(result, 0);
		MyTest.equal(false, sti.isValid);
		
		result = sti.StrToInt("123a86");
		MyTest.equal(result, 0);
		MyTest.equal(false, sti.isValid);
	}
}















