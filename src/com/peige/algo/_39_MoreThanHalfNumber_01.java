package com.peige.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目：
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 
 * 解法1：使用哈希表
 * 时间复杂度O(n)
 * 空间复杂度O(n)
 * 数组不会乱序
 * 
 * @author peige
 */
public class _39_MoreThanHalfNumber_01 {

    public static int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0)
        	return 0;
        if(array.length == 1)
        	return array[0];
        int num = array.length / 2 + 1;
    	Map<Integer, Integer> map = new HashMap<>();
        for(int i : array) {
        	if(map.containsKey(i)) {
        		int n = map.get(i) + 1;
        		if(n >= num)
        			return i;
        		map.put(i, n);
        	}
        	else
        		map.put(i, 1);
        }
        return 0;
    }
}









