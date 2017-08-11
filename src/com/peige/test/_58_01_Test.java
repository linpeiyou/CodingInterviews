package com.peige.test;

import com.peige.algo._58_01_ReverseWordsInSentence;

public class _58_01_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	
	private static void test1() {
		_58_01_ReverseWordsInSentence rwis = new _58_01_ReverseWordsInSentence();
		String s = rwis.ReverseSentence("student. a am I");
		MyTest.equal(s, "I am a student.");
		
		s = rwis.ReverseSentence("hello, peyton lin.");
		MyTest.equal(s, "lin. peyton hello,");
		
		// 两个空格 
		s = rwis.ReverseSentence("hello  ");
		MyTest.equal(s, "  hello");
	}
	
	private static void test2() {
		_58_01_ReverseWordsInSentence rwis = new _58_01_ReverseWordsInSentence();
		String s = rwis.ReverseSentence("a");
		MyTest.equal(s, "a");
		
		s = rwis.ReverseSentence("abc");
		MyTest.equal(s, "abc");

		s = rwis.ReverseSentence("");
		MyTest.equal(s, "");
	}
	
	private static void test3() {
		_58_01_ReverseWordsInSentence rwis = new _58_01_ReverseWordsInSentence();
		String s = rwis.ReverseSentence(null);
		System.out.println(s);
	}
}







