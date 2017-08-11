package com.peige.algo;

/**
 * 题目：
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 
 * 解法3：基于Partition函数的时间复杂度为O(n)的算法
 * 时间复杂度O(n)
 * 空间复杂度O(1)
 * 数组会乱序
 * 
 * 思路：
 * 如果把这个数组排序，那么排序之后位于数组中间的数字
 * 一定就是那个出现次数超过数组长度一般的数字
 * 
 * @author peige
 */
public class _39_MoreThanHalfNumber_03 {

	public int MoreThanHalfNum_Solution(int [] array) {
		if(array == null || array.length == 0)
			return 0;
		int midIndex = array.length / 2;
		int start = 0;
		int end = array.length - 1;
		int p = partition(array, start, end);
		while(p != midIndex) {
			if(p > midIndex)
				end = p - 1;
			else if(p < midIndex)
				start = p + 1;
			p = partition(array, start, end);
		}
		if(checkMoreThanHalf(array, array[p]))
			return array[p];
		return 0;
    }
	
	private boolean checkMoreThanHalf(int[] array, int val) {
		int count = 0;
		for(int i : array) {
			if(i == val)
				++count;
		}
		return count > array.length / 2;
	}

	private int partition(int[] array, int low, int high) {
		int val = array[low];
		int i = low + 1;
		int j = high;
		while(true) {
			while(i <= high && array[i] < val)
				++i;
			while(j >= low && array[j] > val)
				--j;
			if(i > j)
				break;
			swap(array, i++, j--);
		}
		swap(array, low, j);
		return j;
	}
	
	private void swap(int[] array, int indexA, int indexB) {
		int t = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = t;
	}
}


















