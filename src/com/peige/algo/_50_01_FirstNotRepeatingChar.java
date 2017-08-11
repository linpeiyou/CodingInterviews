package com.peige.algo;

/**
 * 题目：
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 * 
 * 思路：
 * 哈希表
 * 
 * @author peige
 */
public class _50_01_FirstNotRepeatingChar {

    public static int FirstNotRepeatingChar(String str) {
    	if(str == null || str.length() == 0)
    		return -1;
    	int[] ch = new int[256];
    	for(int i = 0; i < str.length(); ++i) {
    		++ch[str.charAt(i)];
    	}
    	for(int i = 0; i < str.length(); ++i) {
    		if(ch[str.charAt(i)] == 1) {
    			return i;
    		}
    	}
        return -1;
    }
    
}
