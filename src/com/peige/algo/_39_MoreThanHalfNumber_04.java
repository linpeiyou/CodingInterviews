package com.peige.algo;

/**
 * 题目：
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 
 * 解法4：根据数组特点找出时间复杂度为O(n)的算法
 * 数组中有一个数字出现的次数超过数组长度的一半，说明它出现的次数比其他所有数字出现的次数和还要多。
 * 
 * 因此我们可以使用以下解法：
 * 1.保存两个值：一个是数组中的一个数字val，一个是次数count。
 * 2.当我们遍历到下一个数字时，
 *   if count=0，则val设置为当前数字，count设置为1；
 *   else if 这个数字和val相同，则count+1；
 *   else count-1；
 *   
 * 由于我们要找的数字出现的次数比其他所有数字出现的次数和多，
 * 那么要找的数字肯定是最后一次把数组设置为1时对应的数字，即val可能就是我们要的值
 * 之所以说是可能，是因为还要验证val出现的次数是否真正超过了数组长度的一半
 * 
 * @author peige
 */
public class _39_MoreThanHalfNumber_04 {
	
	public int MoreThanHalfNum_Solution(int [] array) {
		if(array == null || array.length == 0)
			return 0;
        int val = 0;
        int count = 0;
        for(int i : array) {
        	if(count == 0) {
        		val = i;
        		count = 1;
        	}
        	else if(val == i)
        		++count;
        	else
        		--count;
        }
        if(checkMoreThanHalf(array, val))
        	return val;
		return 0;
    }
	
	private boolean checkMoreThanHalf(int[] array, int val) {
		int count = 0;
		for(int i : array) {
			if(i == val)
				++count;
		}
		return count > array.length / 2;
	}
}













