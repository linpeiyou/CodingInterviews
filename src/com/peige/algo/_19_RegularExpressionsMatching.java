package com.peige.algo;

/**
 * 题目：
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。
 * 模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 * 
 * 思路：
 * 正则表达式中有三种情况：
 * a.普通字符
 * b.字符'.'
 * c.普通字符或'.' + 字符'*'
 * 
 * 碰到情况a、b都直接对比可以匹配，
 * 难点在于处理情况c
 * 情况c可以分两种子情况处理：
 * c1.字符串的首字母与模式的首字母不匹配，模式直接右移两格（相当于'*'前面的字符出现了0次）
 * c2.字符串的首字母与模式的首字母匹配，则：
 *      字符串右移一格，模式不移动（'*'前面的字符出现了不止一次）
 *      或字符串右移一格，模式右移两格（'*'前面的字符出现了刚好一次）
 *      或字符串不移动，模式右移两格（'*'前面的字符出现了0次）
 *      
 * 当字符串和模式同时走到结尾+1的位置，则表示匹配
 * 
 * 
 * 解法：
 * 首先检查模式当前字符的下一个字符是否为*，是的话对三种情况处理
 * 
 * @author peige
 */
public class _19_RegularExpressionsMatching {

    public boolean match(char[] str, char[] pattern) {
    	if(str == null || pattern == null)
    		return false;
    	
    	return match(str, 0, pattern, 0);
    }
    
    private boolean match(char[] str, int strIndex, char[] pattern, int patternIndex) {
    	if(strIndex == str.length && patternIndex == pattern.length)
    		return true;
    	if(patternIndex == pattern.length)
    		return false;

    	int patternNextIndex = patternIndex + 1;
    	
    	// 模式下一个字符为'*'
    	if(patternNextIndex < pattern.length && pattern[patternNextIndex] == '*') {
    		// str已经走到结尾 || str的字母不等于pattern的字母
    		if(strIndex == str.length || 
    				(str[strIndex] != pattern[patternIndex] && pattern[patternIndex] != '.')) {
    			return match(str, strIndex, pattern, patternIndex + 2);
	    	}
    		else {
    			return match(str, strIndex + 1, pattern, patternIndex + 2) ||
						match(str, strIndex, pattern, patternIndex + 2) ||
						match(str, strIndex +1, pattern, patternIndex);
    		}
    	}
		// 模式下一个字符不为'*' && str走到了结尾 
    	else if(strIndex == str.length)
    		return false;
    	else if(str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')
			return match(str, strIndex + 1, pattern, patternIndex + 1);
    	
    	return false;
    }
    
}












