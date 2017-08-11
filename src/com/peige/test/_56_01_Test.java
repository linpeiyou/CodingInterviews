package com.peige.test;

import com.peige.algo._56_01_NumbersAppearOnce;

public class _56_01_Test {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	private static void test1() {
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		_56_01_NumbersAppearOnce nao = new _56_01_NumbersAppearOnce();
		nao.FindNumsAppearOnce(new int[] {55,2,3,1,1,2,55,6,7,6}, num1, num2);
		System.out.println((num1[0] == 3 && num2[0] == 7) || (num1[0] == 7 && num2[0] == 3)); 
	}
	
	private static void test2() {
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		_56_01_NumbersAppearOnce nao = new _56_01_NumbersAppearOnce();
		nao.FindNumsAppearOnce(new int[] {55,2}, num1, num2);
		System.out.println((num1[0] == 55 && num2[0] == 2) || (num1[0] == 2 && num2[0] == 55)); 
	}
}
