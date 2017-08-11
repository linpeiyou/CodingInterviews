package com.peige.algo;

/**
 * 题目：
 * 统计一个数字在排序数组中出现的次数。
 * 
 * 思路：
 * 二分法找到该数字的第一个下标，和最后一个下标
 * 若在数组中找到某下标对应的值为k，
 * 如果它的前一个数字不为k，则它就是第一个k；
 * 如果它的后一个数字不为k，则它就是最后一个k
 * 
 * @author peige
 */
public class _53_01_NumberOfK {

    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0)
        	return 0;
        int indexOfFirstK = getFirstK(array, 0, array.length - 1, k);
        int indexOfLastK = getLastK(array, 0, array.length - 1, k);
        if(indexOfFirstK == -1)
        	return 0;
        return indexOfLastK - indexOfFirstK + 1;
    }
    
    private int getFirstK(int[] array, int low, int high, int k) {
    	if(low > high)
    		return -1;
    	int mid = low + (high - low) / 2;
    	if(array[mid] > k) 
    		return getFirstK(array, low, mid - 1, k);
    	else if(array[mid] < k)
    		return getFirstK(array, mid + 1, high, k);
    	else if(mid > 0 && array[mid - 1] == k) 
    		return getFirstK(array, low, mid - 1, k);
    	else
    		return mid;
    }
    
    private int getLastK(int[] array, int low, int high, int k) {
    	if(low > high)
    		return -1;
    	int mid = low + (high - low) / 2;
    	if(array[mid] > k) 
    		return getLastK(array, low, mid - 1, k);
    	else if(array[mid] < k)
    		return getLastK(array, mid + 1, high, k);
    	else if(mid < high && array[mid + 1] == k) 
    		return getLastK(array, mid + 1, high, k);
    	else
    		return mid;
    }
}














