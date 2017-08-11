package com.peige.algo;

import java.util.LinkedList;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * 
 * 测试：
 * 1.两个数组都只含有一个数字（匹配或不匹配）
 * 2.两个数组都含有多个数字（匹配或不匹配）
 * 3.输入null
 * 
 * @author peige
 */
public class _31_StackPushPopOrder {

	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		if(pushA == null || popA == null || pushA.length != popA.length)
			return false;
		
		LinkedList<Integer> list = new LinkedList<>();
		int popIndex = 0;
		
		for(int i = 0; i < pushA.length; ++i) {
			list.addFirst(pushA[i]);
			if(pushA[i] == popA[popIndex]) {
				list.removeFirst();
				++popIndex;
				while(!list.isEmpty()) {
					if(list.peekFirst() == popA[popIndex]) {
						list.removeFirst();
						++popIndex;
						continue;
					}
					break;
				}
			}
		}
		if(popIndex == popA.length && list.isEmpty())
			return true;
		return false;
    }
}
