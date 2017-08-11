package com.peige.algo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 题目：
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 
 * 思路：
 * 考虑到两个数字的拼接可能会出现溢出问题，所以该问题使用字符串来处理
 * 可以转换成字符串排序问题
 * 如数字a与数字b，拼接成字符串ab和字符串ba，
 * 然后按照字典序进行比较，如果ab < ba，则数字a应该排在前面，否则反之
 * 
 * @author peige
 */
public class _45_SortArrayForMinNumber {

    public static String PrintMinNumber(int [] numbers) {
    	if(numbers == null || numbers.length == 0)
    		return "";
    	TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
    		// 不应该出现0的情况
			@Override
			public int compare(String o1, String o2) {
				return (o1 + o2).compareTo(o2 + o1) > 0 ? 1 : -1;
			}
		});
    	
    	for(int number : numbers) {
    		set.add(String.valueOf(number));
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for(String s : set) {
    		sb.append(s);
    	}
    	return sb.toString();
    }
}










