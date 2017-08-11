package com.peige.algo;

/**
 * 题目：
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。 
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 
 * @author peige
 */
public class _11_MinNumberInRotatedArray {

	public static int minNumberInRotateArray(int[] array) {
		if(array.length == 0)
			return 0;
		if(array[0] < array[array.length-1])
			return array[0];
		
		int midIndex = (array.length - 1) / 2;
		int midNum = array[midIndex];
		
		if(array[0] != midNum || (array[0] == midNum && array[0] != array[array.length-1]))
			return findInBinary(array, 0, array.length - 1);
		else
			return findInSequence(array);
	}
	
	private static int findInBinary(int[] array, int start, int end) {
		int midIndex = start + (end - start) / 2;
		if(midIndex == array.length || start == end)
			return array[midIndex];
		
		if(array[midIndex] > array[midIndex+1])
			return array[midIndex+1];
		else if(array[midIndex] >= array[0])
			return findInBinary(array, midIndex+1, end);
		else
			return findInBinary(array, start, midIndex);
	}
	
	private static int findInSequence(int[] array) {
		for(int i = 1; i < array.length; ++i) {
			if(array[i] < array[i - 1])
				return array[i];
		}
		return array[0];
	}
	
}
















