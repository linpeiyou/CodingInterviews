package com.peige.algo;

/**
 * 题目：
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * 
 * 解法1：
 * 对数组排序，然后找出重复数字
 * 时间复杂度O(nlogn)
 * 空间复杂度O(1)
 * 
 * 解法2：
 * 使用哈希表
 * 时间复杂度O(n)
 * 空间复杂度O(n)
 * 
 * 注意题目中的一个条件：所有数字都在0到n-1的范围内
 * 解法1和解法2都是最普通的做法，并没有利用好这个条件。
 * 
 * 解法3：
 * 遍历数组，当遍历到下标为i的数字时，首先比较arr[i]是否等于i
 * 如果arr[i]等于i，则遍历下一个数字；
 * 如果arr[i]不等于i，且arr[arr[i]]不等于arr[i]，则交换这两个元素的值；
 * 如果arr[i]不等于i，且arr[arr[i]]等于arr[i]，则该元素为重复数字
 * 
 * 例如：
 * 数组{2,3,1,0,2,5,3}
 * 1.arr[0]等于2≠0，且arr[2]不等于2，则交换元素，数组变成{1,3,2,0,2,5,3}
 * 2.arr[0]等于1≠0，且arr[1]不等于1，则交换元素，数组变成{3,1,2,0,2,5,3}
 * 3.arr[0]等于3≠0，且arr[3]不等于3，则交换元素，数组变成{0,1,2,3,2,5,3}
 * 4.arr[0]等于0
 * 5.arr[1]等于1
 * 6.arr[2]等于2
 * 7.arr[3]等于3
 * 8.arr[4]等于2≠4，且arr[2]等于2，则找到重复元素2
 * 
 * @author peige
 */
public class _03_DuplicationInArray {
	
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
    	if(numbers == null || numbers.length < 2 || length < 2 || 
    			duplication == null || duplication.length == 0)
    		return false;
    	boolean hasDuplicate = false;
    	int i = 0;
    	while(i < length) {
    		int m = numbers[i];
    		if(m == i) {
    			++i;
    		}
    		else if(numbers[m] != m) {
    			numbers[i] = numbers[m];
    			numbers[m] = m;
    		}
    		// 找到了重复元素
    		else {
    			hasDuplicate = true;
    			duplication[0] = m;
    			break;
    		}
    	}
    	return hasDuplicate;
    }
}













