package com.peige.test;

import com.peige.algo._03_DuplicationInArray;

public class _03_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		int[] duplication = new int[1];
		boolean b = _03_DuplicationInArray.duplicate(new int[] {2,6,3,3,1,2,5}, 7, duplication);
		MyTest.equal(b, true);
		System.out.println(duplication[0]);
		
		b = _03_DuplicationInArray.duplicate(new int[] {3,4,2,1,0}, 5, duplication);
		MyTest.equal(b, false);
	}
	
	private static void test2() {
		int[] duplication = new int[1];
		boolean b = _03_DuplicationInArray.duplicate(new int[] {1,0}, 2, duplication);
		MyTest.equal(b, false);
		
		b = _03_DuplicationInArray.duplicate(new int[] {1,1}, 2, duplication);
		MyTest.equal(b, true);
		System.out.println(duplication[0]);
	}
	
	private static void test3() {
		int[] duplication = new int[1];
		boolean b = _03_DuplicationInArray.duplicate(null, 2, duplication);
		MyTest.equal(b, false);
		
		b = _03_DuplicationInArray.duplicate(new int[] {1}, 1, duplication);
		MyTest.equal(b, false);
		
		b = _03_DuplicationInArray.duplicate(new int[0], 0, duplication);
		MyTest.equal(b, false);
	}
}













