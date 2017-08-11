package com.peige.algo;

/**
 * 题目：
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * 
 * 思路：
 * 使用位运算
 * 
 * @author peige
 */
public class _65_AddTwoNumbers {

    public static int Add(int num1, int num2) {
    	int sum = num1 ^ num2;
    	int carry = (num1 & num2) << 1;
    	while(carry != 0) {
    		int tmp = sum;
    		sum ^= carry;
    		carry = (carry & tmp) << 1;
    	}
    	return sum;
    }
}
