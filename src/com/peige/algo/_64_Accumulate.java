package com.peige.algo;

/**
 * 题目：
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 
 * 思路：
 * 与 n 有关，又有题目那些限制，我们首先想到用数组解决。
 * 将数的累加放到构造函数中。
 * 不过因为数组不用for无法直接初始化，所以这个方法是错误的。
 * 
 * 解法：
 * 用&&做截断
 * 
 * @author peige
 */
public class _64_Accumulate {
	
    public static int Sum_Solution(int n) {
    	int sum = 0;
    	boolean b = (n > 0) && ((sum += Sum_Solution(n - 1) + n) > 0);
    	return sum;
    }
}















