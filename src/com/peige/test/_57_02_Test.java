package com.peige.test;

import com.peige.algo._57_02_ContinuousSequenceWithSum;

public class _57_02_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		// [2,3]
		System.out.println(_57_02_ContinuousSequenceWithSum.FindContinuousSequence(5));
		// [2,3,4], [4,5]
		System.out.println(_57_02_ContinuousSequenceWithSum.FindContinuousSequence(9));
	}
	
	private static void test2() {
		// [1,2]
		System.out.println(_57_02_ContinuousSequenceWithSum.FindContinuousSequence(3));
	}
	
	private static void test3() {
		// []
		System.out.println(_57_02_ContinuousSequenceWithSum.FindContinuousSequence(2));
		// []
		System.out.println(_57_02_ContinuousSequenceWithSum.FindContinuousSequence(-1));
	}
}
