package com.peige.algo;

/**
 * 使用递归的方式解决
 * 
 * @author peige
 */
public class _17_Print1ToMaxOfNDigits_1 {
	
	public static void Print1ToMaxOfNDigits_1(int n) {
		if(n <= 0)
			return;
		char[] digits = new char[n];
		Print1ToMaxOfNDigits_1(digits, n-1);
	}
	
	/**
	 * 递归，实现全排列
	 */
	private static void Print1ToMaxOfNDigits_1(char[] digits, int index) {
		if(index == -1) {
			PrintDigit(digits);
			return;
		}
		for(int i = 0; i < 10; ++i) {
			digits[index] = (char) ('0' + i);
			Print1ToMaxOfNDigits_1(digits, index-1);
		}
	}
	
	/**
	 * 打印digits，注意开头不要打印0
	 */
	private static void PrintDigit(char[] digits) {
		boolean zeroFlag = true;
		for(int i = digits.length-1; i >= 0; --i) {
			if(digits[i] == '0' && zeroFlag)
				continue;
			System.out.print(digits[i]);
			zeroFlag = false;
		}
		if(zeroFlag == false) {
			System.out.print(' ');
		}
	}

}
