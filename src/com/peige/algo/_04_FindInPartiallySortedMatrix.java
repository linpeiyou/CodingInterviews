package com.peige.algo;

/**
 * 题目：
 * 在一个二维数组中，
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 
 * @author peige
 */
public class _04_FindInPartiallySortedMatrix {
	
	public static boolean Find(int target, int[][] array) {
		// 不做这个判断的话，在y=array[0].length-1时会抛出异常
		if(array.length == 0)
			return false;
		int x = 0;
		int y = array[0].length - 1;
		while(x < array.length && y >= 0) {
			if(array[x][y] > target)
				--y;
			else if(array[x][y] < target)
				++x;
			else
				return true;
		}
		return false;
	}
	
}
