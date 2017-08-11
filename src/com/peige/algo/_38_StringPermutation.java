package com.peige.algo;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * 题目：
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc, 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * ps：输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 * 
 * @author peige
 */
public class _38_StringPermutation {

	TreeSet<String> set;
	
    public ArrayList<String> Permutation(String str) {
        if(str == null || str.trim().length() == 0)
        	return new ArrayList<>();
        char[] chars = str.toCharArray();
    	set = new TreeSet<>();
    	Permutation(chars, 0);
    	return new ArrayList<>(set);
    }
    
    private void Permutation(char[] chars, int index) {
    	if(index == chars.length - 1) {
    		set.add(new String(chars));
    		return;
    	}
    	for(int i = index; i < chars.length; ++i) {
    		swap(chars, i, index);
    		Permutation(chars, index + 1);
    		swap(chars, i, index);
    	}
    }
    
    private void swap(char[] chars, int indexA, int indexB) {
    	char c = chars[indexA];
    	chars[indexA] = chars[indexB];
    	chars[indexB] = c;
    }
}










