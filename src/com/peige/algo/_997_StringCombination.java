package com.peige.algo;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * 题目：
 * 输入一个字符串，求字符串中字符的所有组合
 * 例如输入字符串"abc"，则它们的组合有a, b, c, ab, ac, bc, abc
 * 当交换字符串中的两个字符时，虽然能得到两个不同的排列，但却是同一个组合。
 * 比如 ab 和 ba 是不同的排列，但只算一个组合。
 * 
 * @author peige
 */
public class _997_StringCombination {

	private StringBuilder sb;
	private Set<String> result;
	private int index;
	
	public ArrayList<String> stringCombination(String str) {
		if(str == null || str.trim().length() == 0)
			return new ArrayList<>();
		char chars[] = str.toCharArray();
		sb = new StringBuilder();
		result = new TreeSet<>();
		index = 0;
		for(int i = 1; i <= str.length(); ++i) {
			stringCombination(chars, i);
		}
		return new ArrayList<>(result);
	}
	
	private void stringCombination(char[] chars, int length) {
		if(length == 0) {
			result.add(sb.toString());
			return;
		}
		if(chars.length - index < length) {
			return;
		}
		// 选择第一个，从剩下的中选择length-1个
		sb.append(chars[index]);
		++index;
		stringCombination(chars, length - 1);
		sb.deleteCharAt(sb.length() - 1);
		
		// 不选择第一个，从剩下的中选择length个
		stringCombination(chars, length);
		--index;
	}
	
}










