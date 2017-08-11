package com.peige.algo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 题目：
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。 
 * 对应每个测试案例，输出两个数，小的先输出。
 * 
 * 思路：
 * 充分利用数组已排序的特点，
 * 将第一个指针指向数组最小的元素（头），将第二个指针指向数组最大的元素（末尾）
 *     若此时两个元素的和等于S，则这是我们要的答案
 *     如果此时两个元素的和小于S，则将第一个指针指向下一个元素
 *     如果此时两个元素的和大于S，则将第二个指针指向前一个元素
 * 
 * 题目要求如果有多对符合的数字，则输出两数乘积最小的
 * 设两数的和为2m，则其中一个数字为m-a，另外一个数字为m+a
 * (m+a)(m-a) = m² - a²
 * 所以当a越大，乘积越小
 * 
 * 即本题中，两个数组下标差越大时，乘积越小，即第一对符合的元素就是我们要的答案
 * 
 * @author peige
 */
public class _57_01_TwoNumbersWithSum {

    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        if(array == null || array.length < 2) 
        	return new ArrayList<>();
        int low = 0;
        int high = array.length - 1;
        while(low < high) {
        	if(array[low] + array[high] > sum)
        		--high;
        	else if(array[low] + array[high] < sum)
        		++low;
        	else
        		return new ArrayList<>(Arrays.asList(array[low], array[high]));
        }
        return new ArrayList<>();
    }
    
}











