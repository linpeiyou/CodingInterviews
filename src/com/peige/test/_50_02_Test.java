package com.peige.test;

import com.peige.algo._50_02_FirstCharacterInStream;

public class _50_02_Test {
	
	public static void main(String[] args) {
		test1();
	}
	
	private static void test1() {
		_50_02_FirstCharacterInStream fcis = new _50_02_FirstCharacterInStream();
		// 极端测试
		char c = fcis.FirstAppearingOnce();
		MyTest.equal(c, '#');
		
		fcis.Insert('a');
		// 边界测试
		c = fcis.FirstAppearingOnce();
		MyTest.equal(c, 'a');
		
		fcis.Insert('a');
		fcis.Insert('b');
		fcis.Insert('c');
		// aabc
		c = fcis.FirstAppearingOnce();
		MyTest.equal(c, 'b');
		
		fcis.Insert('b');
		fcis.Insert('a');
		// aabcba
		c = fcis.FirstAppearingOnce();
		MyTest.equal(c, 'c');
		
		fcis.Insert('c');
		// aabcbac
		c = fcis.FirstAppearingOnce();
		MyTest.equal(c, '#');
	}

}
