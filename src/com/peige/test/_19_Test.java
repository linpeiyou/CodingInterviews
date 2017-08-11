package com.peige.test;

import com.peige.algo._19_RegularExpressionsMatching;

public class _19_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}
	
	/**
	 * 功能测试
	 * 0. 没有'.'和'*'
	 * 1. '.'
	 * 2. '.' + '*'
	 * 3. '*'匹配0次
	 * 4. '*'匹配多次
	 * 5. '*'匹配一次
	 */
	private static void test1() {
		_19_RegularExpressionsMatching rem = new _19_RegularExpressionsMatching();
		boolean b = rem.match(new char[] {'a','a','b','c'}, new char[] {'a','a','b','c'});
		MyTest.equal(b, true);
		
		b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','.','.','.'});
		MyTest.equal(b, true);
		
		b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','.','*'});
		MyTest.equal(b, true);
		
		b = rem.match(new char[] {'a','b'}, new char[] {'a','a','*','b'});
		MyTest.equal(b, true);

		b = rem.match(new char[] {'a','b'}, new char[] {'a','b', '*'});
		MyTest.equal(b, true);
		
		b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','*','b'});
		MyTest.equal(b, true);
		System.out.println("====================================================");
	}
	
	/**
	 * 功能测试
	 * 0. 没有'.'和'*'
	 * 1. '.'
	 * 2. '.' + '*'
	 * 3. '*'匹配0次
	 * 4. '*'匹配多次
	 * 5. '*'匹配一次
	 */
	private static void test2() {
		_19_RegularExpressionsMatching rem = new _19_RegularExpressionsMatching();
		boolean b = rem.match(new char[] {'a','a','b','c'}, new char[] {'a','a','b'});
		MyTest.equal(b, false);
		
		b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','.','.'});
		MyTest.equal(b, false);
		
		b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','.','*','c'});
		MyTest.equal(b, false);
		
		b = rem.match(new char[] {'a','b'}, new char[] {'a','a','*'});
		MyTest.equal(b, false);

		b = rem.match(new char[] {'a','b'}, new char[] {'a','b', '*','c'});
		MyTest.equal(b, false);
		
		b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','*'});
		MyTest.equal(b, false);
		System.out.println("====================================================");
	}
	
	/**
	 * 边界测试
	 * 1. '1' - '1'
	 * 2. '1' - '.'
	 * 3. '1' - '1','*'
	 * 4. '1' - '.','*'
	 */
	private static void test3() {
		_19_RegularExpressionsMatching rem = new _19_RegularExpressionsMatching();
		boolean b = rem.match(new char[] {'1'}, new char[] {'1'});
		MyTest.equal(b, true);
		
		b = rem.match(new char[] {'1'}, new char[] {'.'});
		MyTest.equal(b, true);
		
		b = rem.match(new char[] {'1'}, new char[] {'1','*'});
		MyTest.equal(b, true);
		
		b = rem.match(new char[] {'1'}, new char[] {'.','*'});
		MyTest.equal(b, true);
		System.out.println("====================================================");
	}
	
	/**
	 * 极端测试
	 */
	private static void test4() {
		_19_RegularExpressionsMatching rem = new _19_RegularExpressionsMatching();
		boolean b = rem.match(null, new char[] {'1'});
		MyTest.equal(b, false);
		
		b = rem.match(new char[] {'1'}, null);
		MyTest.equal(b, false);
		
		b = rem.match(null, null);
		MyTest.equal(b, false);
	}
}













