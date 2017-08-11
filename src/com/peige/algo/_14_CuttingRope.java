package com.peige.algo;

/**
 * 题目：
 * 给你一根长度为n的绳子，请把绳子剪成m段（m、n都是整数，n>1,m>1），
 * 每段绳子的长度记为 k[0], k[1], k[2], ..., k[m]。
 * 请问 k[0] * k[1] * k[2] * ... * k[m] 可能的最大乘积是多少？
 * 例如，当绳子的长度为8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 
 * @author peige
 */
public class _14_CuttingRope {

	/**
	 * 动态规划解决
	 * 时间O(n²)，空间O(n)
	 * f(n) = max(f(i), f(n-i))
	 */
	public static int cuttingRopeInDynamic(int length) {
		if(length < 2)
			return 0;
		if(length == 2)
			return 1;
		if(length == 3) 
			return 2;
		
		int[] max = new int[length+1];
		max[0] = 0;
		max[1] = 1;
		max[2] = 2;
		max[3] = 3;
		
		for(int i = 4; i <= length; ++i) {
			int maxValue = 0;
			for(int j = 1; j <= i / 2; ++j) {
				int tmp = max[j] * max[i - j];
				if(tmp > maxValue)
					maxValue = tmp;
			}
			max[i] = maxValue;
		}
		return max[length];
	}
	
	/**
	 * 贪婪算法解决
	 * 当 n >= 5 时，
	 * 2(n-2) > n
	 * 3(n-3) > n
	 * 3(n-3) >= 2(n-2)
	 * 
	 * 时间O(1)，空间O(1)
	 */
	public static int cuttingRopeInGreedy(int length) {
		if(length < 2)
			return 0;
		if(length == 2)
			return 1;
		if(length == 3) 
			return 2;
		
		int timesOf3 = length / 3;
		
		// 尽可能多的剪去长度为3的绳子
		length -= timesOf3 * 3;
		
		// 如果绳子最后剩下长度为4，应该剪成 2+2，而不是 3+1
		if(length == 1) {
			timesOf3 -= 1;
			return (int) Math.pow(3, timesOf3) * 2 * 2;
		}
		else if(length == 0) {
			return (int) Math.pow(3, timesOf3);
		}
		// length == 2
		else {
			return (int) Math.pow(3, timesOf3) * 2;
		}
	}
	
}













