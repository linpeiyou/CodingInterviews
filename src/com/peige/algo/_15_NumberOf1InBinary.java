package com.peige.algo;

/**
 * 题目：
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 
 * 思路：
 * int是32位的
 * 负数第一位为1，正数第一位为0
 * 将这个数每次右移一位，和1做与操作
 * 
 * @author peige
 */
public class _15_NumberOf1InBinary {
	
    public static int NumberOf1(int n) {
    	int count = 0;
    	for(int i = 0; i < 32; ++i) {
    		count += n & 1;
    		n >>= 1;
    	}
    	return count;
    }
    
    /**
     * 惊喜的解法
     * 只需要循环1的个数次
     */
    public static int MagicNumberOf1(int n) {
    	int count = 0;
    	while(n != 0) {
    		int tmp = n - 1;
    		n &= tmp;
    		++count;
    	}
    	return count;
    }
}









