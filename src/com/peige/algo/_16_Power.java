package com.peige.algo;

/**
 * 题目：
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 
 * 思路：
 * public double Power(double base, int exp)
 * 即 base ^ exp
 * 如果exp为偶数，则拆分成(base ^ (exp/2)) * (base ^ (exp/2))
 * 如果exp为奇数，则拆分成(base ^ (exp/2)) * (base ^ (exp/2)) * base
 * 
 * 注意：exp可能为负数，负数时先将 exp 转换成绝对值，求出答案 res，最终答案为 1/res 
 * 
 * @author peige
 */
public class _16_Power {

	public double Power(double base, int exponent) {
		if(base == 0)
			return 0;
		if(exponent == 0)
			return 1;
		boolean positive = exponent > 0;
		exponent = positive ? exponent : -exponent;
		
		if(positive)
			return PowerCore(base, exponent);
		else 
			return 1 / PowerCore(base, exponent);
	}
	
	private double PowerCore(double base, int exponent) {
		if(exponent == 0)
			return 1;
		if(exponent == 1)
			return base;
		
		//double tmp = Power(base, exponent / 2);
		double tmp = Power(base, exponent >> 1);
		
		//if(exponent % 2 == 0)
		if((exponent & 1) == 0)
			return tmp * tmp;
		else
			return tmp * tmp * base;
	}
	
}


















