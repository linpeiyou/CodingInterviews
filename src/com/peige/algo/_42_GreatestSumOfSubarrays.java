package com.peige.algo;

/**
 * 题目：
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,
 * 常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 *
 *
 * 这道题之前在某本书的第一题看过，思路懂了结题就很简单了。
 * 思路：
 * 1.保存两个值，一个sum，一个max，sum初始化为0，max初始化为数组第一个元素
 * 2.从下标0开始遍历，sum += 遍历到的元素。
 *   如果sum > 0，则与max比较，如果大于max则max=sum
 *   如果sum <= 0，则与max比较，如果大于max则max=sum，并把sum置于0
 * 
 * @author peige
 */
public class _42_GreatestSumOfSubarrays {

    public static int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0)
        	return 0;
        int sum = 0;
        int max = array[0];
        for(int i : array) {
        	if(sum < 0)
        		sum = i;
        	else
        		sum += i;
        	if(sum > max)
        		max = sum;
        }
        return max;
    }
}











