package com.peige.algo;

import java.util.Arrays;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 * 
 * @author peige
 */
public class _51_InversePairs {

	private static int N = 1000000007;
	
	private int inversePairs;
	
    public int InversePairs(int [] array) {
    	if(array == null || array.length <= 1)
    		return 0;
    	inversePairs = 0;
    	mergeSort(array);
    	return inversePairs;
    }
    
    private void mergeSort(int[] array) {
    	int[] tmp = new int[array.length];
    	mergeSort(array, 0, array.length - 1, tmp);
    }
    
    private void mergeSort(int[] array, int low, int high, int[] tmp) {
    	if(low >= high)
    		return;
    	int mid = low + (high - low) / 2;
    	mergeSort(array, low, mid, tmp);
    	mergeSort(array, mid + 1, high, tmp);
    	merge(array, low, mid, high, tmp);
    }
    
    private void merge(int[] array, int low, int mid, int high, int[] tmp) {
    	int i = mid;
    	int j = high;
    	int pairs = high - mid;
    	for(int k = low; k <= high; ++k)
    		tmp[k] = array[k];
    	for(int k = high; k >= low; --k) {
    		if(i < low) {
    			array[k] = tmp[j--];
    		}
    		else if(j < mid + 1) {
    			array[k] = tmp[i--];
    		}
    		else if(tmp[i] > tmp[j]) {
    			array[k] = tmp[i--];
    			inversePairs = (inversePairs + pairs) % N;
    		}
    		else {
    			array[k] = tmp[j--];
    			--pairs;
    		}
    	}
    }
}













