package com.peige.test;

import com.peige.algo._50_01_FirstNotRepeatingChar;

public class _50_01_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		int index;
		index = _50_01_FirstNotRepeatingChar.FirstNotRepeatingChar("aabcdcb");
		MyTest.equal(index, 4);
		index = _50_01_FirstNotRepeatingChar.FirstNotRepeatingChar("abcdefg");
		MyTest.equal(index, 0);
	}
	
	/**
	 * 边界测试
	 */
	private static void test2() {
		int index;
		index = _50_01_FirstNotRepeatingChar.FirstNotRepeatingChar("a");
		MyTest.equal(index, 0);
		index = _50_01_FirstNotRepeatingChar.FirstNotRepeatingChar("aabbb");
		MyTest.equal(index, -1);
	}
	
	/**
	 * 极端测试
	 */
	private static void test3() {
		int index;
		index = _50_01_FirstNotRepeatingChar.FirstNotRepeatingChar("");
		MyTest.equal(index, -1);
		index = _50_01_FirstNotRepeatingChar.FirstNotRepeatingChar(null);
		MyTest.equal(index, -1);
	}
}
