package com.peige.algo;

/**
 * 题目：
 * 求斐波那契数列的第n项（n<=39）
 * 写一个函数，输入n，求斐波那契(Fibonacci)数列的第n项
 * 斐波那契数列的定义如下：
 *         ┌ 0                ,   n = 0
 * f(n) =  ├ 1                ,   n = 1
 *         └ f(n-1) + f(n-2)  ,   n > 1     
 * 
 * 0,1,1,2,3,5,8,13...
 * 
 * @author peige
 */
public class _10_Fibonacci {

	public static int Fibonacci(int n) {
		if(n <= 0) 
			return 0;
		if(n == 1) 
			return 1;
		
		int min = 0;
		int max = 1;
		int fib = 1;
		for(int i = 2; i <= n; ++i) {
			fib = max + min;
			min = max;
			max = fib;
		}
		return fib;
	}
	
	
}



















