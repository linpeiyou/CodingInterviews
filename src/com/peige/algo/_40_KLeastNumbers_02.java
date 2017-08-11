package com.peige.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 题目：
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * ps：题目只要求最小的k个数，没有要求这k个数要排序
 * 
 * 解法2：
 * 使用优先队列来做（也可以用红黑树来做）
 * 时间复杂度为O(nlogk)
 * 空间复杂度为O(k)
 * 数组不会乱序
 * 
 * 这个在eclipse编译没错，提交的时候缺编译不通过，估计是Java版本问题
 * 
 * @author peige
 */
public class _40_KLeastNumbers_02 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	if(input == null || input.length == 0 || k <= 0 || k > input.length)
    		return new ArrayList<>();
    	Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    	for(int i : input) {
    		if(queue.size() != k)
    			queue.add(i);
    		else if(queue.peek() > i) {
    			queue.poll();
    			queue.offer(i);
    		}
    	}
    	return new ArrayList<>(queue);
    }
    
}









