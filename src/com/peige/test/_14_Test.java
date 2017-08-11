package com.peige.test;

import com.peige.algo._14_CuttingRope;

public class _14_Test {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	private static void test1() {
		for(int i = -1; i < 10; ++i) {
			System.out.print(_14_CuttingRope.cuttingRopeInDynamic(i) + " ");
		}
		System.out.println();
	}
	
	private static void test2() {
		for(int i = -1; i < 10; ++i) {
			System.out.print(_14_CuttingRope.cuttingRopeInGreedy(i) + " ");
		}
		System.out.println();
	}
}

