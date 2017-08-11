package com.peige.algo;

/**
 * 使用递增的方法解决
 * 
 * @author peige
 */
public class _17_Print1ToMaxOfNDigits_2 {

	public static void Print1ToMaxOfNDigits_2(int n) {
		if(n <= 0)
			return;
		char[] digits = new char[n];
		for(int i = 0; i < digits.length; ++i) {
			digits[i] = '0';
		}
		while(Increment(digits)) {
			PrintDigit(digits);
		}
	}

	/**
	 * 递增 
	 */
	private static boolean Increment(char[] digits) {
		digits[0] += 1;
		for(int i = 0; i < digits.length; ++i) {
			int num = digits[i] - '0';
			if(num == 10) {
				if(i == digits.length-1) {
					return false;
				}
				digits[i+1] += 1;
				digits[i] = '0';
			}
			else {
				break;
			}
		}
		return true;
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
		System.out.print(' ');
	}
	
}











