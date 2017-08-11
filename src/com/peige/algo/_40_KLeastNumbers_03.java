package com.peige.algo;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * 题目：
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * ps：题目只要求最小的k个数，没有要求这k个数要排序
 * 
 * 解法3：
 * 用红黑树来做
 * 时间复杂度为O(nlogk)
 * 空间复杂度为O(k)
 * 数组不会乱序
 * 
 * @author peige
 */
public class _40_KLeastNumbers_03 {
	
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(input == null || input.length == 0 || k <= 0 || k > input.length)
    		return new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
    	for(int i : input) {
    		if(set.size() != k)
    			set.add(i);
    		else if(set.last() > i) {
    			set.pollLast();
    			set.add(i);
    		}
    	}
    	return new ArrayList<>(set);
    }
    
}










