package com.peige.algo;

import java.util.Arrays;
import java.util.Random;

/**
 * 题目：
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 
 * 解法2：排序后统计
 * 时间复杂度O(nlogn)
 * 空间复杂度O(1)
 * 数组会乱序
 * 
 * 可以直接调用Array.sort，但是复习一下快排，这里就直接自己写了
 * 
 * @author peige
 */
public class _39_MoreThanHalfNumber_02 {
	
	public int MoreThanHalfNum_Solution(int [] array) {
		if(array == null || array.length == 0)
			return 0;
		if(array.length == 1)
			return array[0];
		quickSort(array);
		int num = array.length / 2 + 1;
		int number = array[0];
		int count = 0;
		
		for(int i : array) {
			if(i == number) {
				++count;
				if(count >= num)
					return i;
			}
			else {
				number = array[i];
				count = 1;
			}
		}
		return 0;
    }

	private void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}
	
	private void quickSort(int[] array, int low, int high) {
		if(low >= high)
			return;
		int p = partition(array, low, high);
		quickSort(array, low, p - 1);
		quickSort(array, p + 1, high);
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















