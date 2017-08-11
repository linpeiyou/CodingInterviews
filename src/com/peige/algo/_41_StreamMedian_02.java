package com.peige.algo;

import java.util.Collections;
import java.util.TreeSet;

/**
 * 跟使用优先队列的思路一样，这里就不写了
 * 牛客网优先队列编译不过，我也是醉了。
 *  
 * @author peige
 */
public class _41_StreamMedian_02 {

	TreeSet<Integer> maxQ = new TreeSet<>(Collections.reverseOrder());
	TreeSet<Integer> minQ = new TreeSet<>();
	
    public void Insert(Integer num) {
    	if(((maxQ.size() + minQ.size()) & 1) == 0) {
    		maxQ.add(num);
    		minQ.add(maxQ.pollFirst());
    	}
    	else {
    		minQ.add(num);
    		maxQ.add(minQ.pollFirst());
    	}
    }

    public Double GetMedian() {
    	if(maxQ.size() == 0 && minQ.size() == 0)
    		return new Double(0.0);
        if(((maxQ.size() + minQ.size()) & 1) == 0) {
        	return (double)(minQ.first() + maxQ.first()) / 2;
        }
        else {
        	return (double)(minQ.first());
        }
    }
}