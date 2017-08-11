package com.peige.algo;

import java.util.ArrayList;

/**
 * 题目：
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * 
 * 分析：
 * 序列的长度至少为2，和为S的连续整数序列的可能区间为[1, (S+1)/2]
 * 
 * 解法：
 * 两个指针，第一个指针p1指向1，第二个指针p2指向2
 * 循环以下步骤直到 p2 > (S+1)/2 
 *     if 		序列p1~p2的和小于S，p2向前移动
 *     else if 	序列p1~p2的和大于S，p1向前移动
 *     else 	得到符合条件的序列，记录下来，并且p1，p2同时向前移动
 * 
 * @author peige
 */
public class _57_02_ContinuousSequenceWithSum {
    
	public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        if(sum < 3)
        	return new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int low = 1;
        int high = 2;
        int sumOfSequence = low + high;
        while(high <= (sum + 1) / 2) {
        	if(sumOfSequence < sum) {
        		++high;
        		sumOfSequence += high;
        	}
        	else if(sumOfSequence > sum) {
        		sumOfSequence -= low;
        		++low;
        	}
        	else {
        		ArrayList<Integer> oneOfResults = new ArrayList<>();
        		for(int i = low; i <= high; ++i) {
        			oneOfResults.add(i);
        		}
        		result.add(oneOfResults);
        		++high;
        		sumOfSequence += high;
        		sumOfSequence -= low;
        		++low;
        	}
        }
		return result;
    }
}















