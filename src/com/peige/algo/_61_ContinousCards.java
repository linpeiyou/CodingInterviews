package com.peige.algo;

import java.util.Arrays;

/**
 * 题目：
 * LL今天心情特别好，因为他去买了一副扑克牌，发现里面居然有2个大王，2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌，想测测自己的手气，看看能不能抽到顺子，如果抽到的话，他决定去买体育彩票，嘿嘿！！
 * “红心A，黑桃3，小王，大王，方片5”，“Oh My God！”不是顺子.....
 * LL不高兴了，他想了想，决定大王和小王可以看成任何数字，并且A看作1，J为11，Q为12，K为13。
 * 上面的5张牌就可以变成“1，2，3，4，5”（大小王分别看作2和4），“So Lucky!”。
 * LL决定去买体育彩票啦。 现在，要求你使用这幅牌模拟上面的过程，然后告诉我们LL的运气如何。
 * 为了方便起见，你可以认为大小王是0。
 * 
 * 好好的一道题目为什么要描述的这么尴尬呢？！
 * 
 * 思路：
 * 1.首先对数组排序
 * 2.统计数组中0的个数num1
 * 3.统计除0之外其他排序的相邻数字之间的空缺数num2
 * 
 * 如果num1 >= num2，则是顺子
 * 如果num1 < num2，则不是顺子
 * 如果出现了非0的重复数字，则没有顺子
 * 
 * @author peige
 */
public class _61_ContinousCards {
	
    public static boolean isContinuous(int [] numbers) {
    	if(numbers == null || numbers.length == 0)
    		return false;
    	Arrays.sort(numbers);
    	int num1 = 0;
    	int num2 = 0;
    	// 统计0的个数
    	while(num1 != numbers.length && numbers[num1] == 0)
    		++num1;
    	// 计算除了0其他数字的空缺数
    	for(int i = num1 + 1; i < numbers.length; ++i) {
    		if(numbers[i] == numbers[i - 1])
    			return false;
    		num2 += numbers[i] - numbers[i - 1] - 1; 
    	}
    	if(num1 >= num2)
    		return true;
    	return false;
    }
}











