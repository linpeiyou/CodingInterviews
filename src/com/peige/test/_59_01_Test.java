package com.peige.test;

import com.peige.algo._59_01_MaxInSlidingWindow;

public class _59_01_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	private static void test1() {
		// {4,4,6,6,6,5}
		System.out.println(_59_01_MaxInSlidingWindow.maxInWindows(new int[] {2,3,4,2,6,2,5,1}, 3));
		// {4,6,6,6,6}
		System.out.println(_59_01_MaxInSlidingWindow.maxInWindows(new int[] {2,3,4,2,6,2,5,1}, 4));
	}
	
	private static void test2() {
		// {1}
		System.out.println(_59_01_MaxInSlidingWindow.maxInWindows(new int[] {1}, 1));
		// {1,2}
		System.out.println(_59_01_MaxInSlidingWindow.maxInWindows(new int[] {1,2}, 1));
		// {2}
		System.out.println(_59_01_MaxInSlidingWindow.maxInWindows(new int[] {1,2}, 2));
	}
	
	private static void test3() {
		// {}
		System.out.println(_59_01_MaxInSlidingWindow.maxInWindows(null, 1));
		// {}
		System.out.println(_59_01_MaxInSlidingWindow.maxInWindows(new int[] {1,2}, 3));
		// {}
		System.out.println(_59_01_MaxInSlidingWindow.maxInWindows(new int[0], 1));
		// {}
		System.out.println(_59_01_MaxInSlidingWindow.maxInWindows(new int[] {1,2}, -1));
	}
	
}








