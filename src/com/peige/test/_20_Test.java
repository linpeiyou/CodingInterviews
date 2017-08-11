package com.peige.test;

import com.peige.algo._20_NumericStrings;

/**
 * 数字有如下两种情况：
 * A[.B][e|EC]
 * .B[e|EC]
 * 
 * @author peige
 */
public class _20_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}
	
	/**
	 * 功能测试
	 * +1.23e-6
	 * -2.2
	 * 2.4
	 * 2
	 * .4E+9
	 * .123
	 */
	private static void test1() {
		_20_NumericStrings ns = new _20_NumericStrings();
		boolean b = ns.isNumeric(new char[] {'+','1','.','2','3','e','-','6'});
		MyTest.equal(b, true);
		
		b = ns.isNumeric(new char[] {'-','2','.','2'});
		MyTest.equal(b, true);
		
		b = ns.isNumeric(new char[] {'2','.','4'});
		MyTest.equal(b, true);

		b = ns.isNumeric(new char[] {'2'});
		MyTest.equal(b, true);

		b = ns.isNumeric(new char[] {'.','4','E','+','9'});
		MyTest.equal(b, true);

		b = ns.isNumeric(new char[] {'.','1','2','3'});
		MyTest.equal(b, true);
		System.out.println("==================================================");
	}
	
	/**
	 * 功能测试
	 * +1.23-6
	 * -2.
	 * 2+
	 * e.123
	 */
	private static void test2() {
		_20_NumericStrings ns = new _20_NumericStrings();
		boolean b = ns.isNumeric(new char[] {'+','1','.','2','3','-','6'});
		MyTest.equal(b, false);

		b = ns.isNumeric(new char[] {'-','2','.'});
		MyTest.equal(b, false);

		b = ns.isNumeric(new char[] {'2','+'});
		MyTest.equal(b, false);

		b = ns.isNumeric(new char[] {'e','.','1','2','3'});
		MyTest.equal(b, false);
		System.out.println("==================================================");
	}
	
	/**
	 * 边界测试
	 * 1.只有一个数字
	 * 2.只有一个符号
	 * 3.e
	 * 4.只有一个.
	 * 5.字符串长度为0
	 */
	private static void test3() {
		_20_NumericStrings ns = new _20_NumericStrings();
		boolean b = ns.isNumeric(new char[] {'1'});
		MyTest.equal(b, true);

		b = ns.isNumeric(new char[] {'-'});
		MyTest.equal(b, false);

		b = ns.isNumeric(new char[] {'e'});
		MyTest.equal(b, false);

		b = ns.isNumeric(new char[] {'.'});
		MyTest.equal(b, false);

		b = ns.isNumeric(new char[0]);
		MyTest.equal(b, false);
		System.out.println("==================================================");
	}
	
	/**
	 * 极端测试
	 * null
	 */
	private static void test4() {
		_20_NumericStrings ns = new _20_NumericStrings();
		boolean b = ns.isNumeric(null);
		MyTest.equal(b, false);
	}
}














