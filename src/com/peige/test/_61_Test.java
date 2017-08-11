package com.peige.test;

import com.peige.algo._61_ContinousCards;

public class _61_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		boolean b = _61_ContinousCards.isContinuous(new int[] {6,3,2,4,0});
		MyTest.equal(b, true);

		b = _61_ContinousCards.isContinuous(new int[] {7,3,2,0,0});
		MyTest.equal(b, false);
		
		b = _61_ContinousCards.isContinuous(new int[] {6,3,2,0,0});
		MyTest.equal(b, true);

		b = _61_ContinousCards.isContinuous(new int[] {1,2,3,3,4});
		MyTest.equal(b, false);
	}
	
	private static void test2() {
		boolean b = _61_ContinousCards.isContinuous(new int[] {1,2,3,4,5});
		MyTest.equal(b, true);
		
		b = _61_ContinousCards.isContinuous(new int[] {3,2,1,4,5});
		MyTest.equal(b, true);
		
		b = _61_ContinousCards.isContinuous(new int[] {0,0,0,0,0});
		MyTest.equal(b, true);
		
		b = _61_ContinousCards.isContinuous(new int[] {0,0,12,0,0});
		MyTest.equal(b, true);
	}
	
	private static void test3() {
		boolean b = _61_ContinousCards.isContinuous(null);
		MyTest.equal(b, false);
		
		b = _61_ContinousCards.isContinuous(new int[0]);
		MyTest.equal(b, false);
	}
}














