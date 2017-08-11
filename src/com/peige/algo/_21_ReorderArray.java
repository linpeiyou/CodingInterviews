package com.peige.algo;

import java.util.LinkedList;

/**
 * 题目：
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * 思路：
 * 感觉这道题并没有比较完美的解法，要么时间复杂度高，要么空间复杂度高
 * 解法1：
 *   遍历数组，将所有奇数前移，将所有偶数保存在队列里，并统计奇数个数
 *   将队列里的偶数再放到数组中
 *   时间复杂度O(n)，空间复杂度O(n)
 * 解法2：
 *   用i表示第一个偶数的下标，j表示i后面第一个奇数的下标（i，j初始化都为-1）
 *   当找到符合的i,j时，将下标为[i,j)的值向后移一位（这个范围内都是偶数），
 *   将原本下标为i的偶数替换为原本下标为j的奇数
 *   最坏时间复杂度为O(n)，空间复杂度为O(1)
 * 
 * @author peige
 */
public class _21_ReorderArray {

	/**
	 * 使用解法1
	 */
    public static void reOrderArray(int[] array) {
    	if(array == null || array.length == 0) 
    		return;
    	LinkedList<Integer> list = new LinkedList<>();
    	int index = 0;
    	for(int val : array) {
    		// 奇数
    		if((val & 1) == 1) {
    			array[index++] = val;
    		}
    		else {
    			list.add(val);
    		}
    	}
    	while(index != array.length) {
    		array[index++] = list.removeFirst();
    	}
    }
    
}














