package com.peige.algo;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 题目：
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如：
 * 如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： 
 * {[2, 3, 4], 2, 6, 2, 5, 1}， 
 * {2, [3, 4, 2], 6, 2, 5, 1}， 
 * {2, 3, [4, 2, 6], 2, 5, 1}， 
 * {2, 3, 4, [2, 6, 2], 5, 1}， 
 * {2, 3, 4, 2, [6, 2, 5], 1}，
 * {2, 3, 4, 2, 6, [2, 5, 1]}。
 * 
 * @author peige
 */
public class _59_01_MaxInSlidingWindow {

    public static ArrayList<Integer> maxInWindows(int [] num, int size) {
    	if(num == null || num.length == 0 || size < 1 || size > num.length)
    		return new ArrayList<>();
    	ArrayList<Integer> result = new ArrayList<>();
    	Deque<Integer> deque = new LinkedList<>();
    	// 初始化滑动窗口
    	for(int i = 0; i < size; ++i) {
    		while(!deque.isEmpty() && num[deque.getLast()] < num[i])
    			deque.removeLast();
    		// 将数字对应的下标添加到双端队列中
    		deque.addLast(i);
    	}
    	result.add(num[deque.getFirst()]);
    	// 右移滑动窗口
    	for(int i = size; i < num.length; ++i) {
    		// 判断最大值是否已滑出滑动窗口
    		if(i - deque.getFirst() >= size)
    			deque.removeFirst();
    		while(!deque.isEmpty() && num[deque.getLast()] < num[i])
    			deque.removeLast();
    		deque.addLast(i);
    		result.add(num[deque.getFirst()]);
    	}
    	return result;
    }
}
















