package com.peige.algo;

/**
 * 题目：
 * 汇编语言中有一种移位指令叫做循环左移（ROL），
 * 现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 * 
 * 解法1：
 * 开辟一个新的数组来存放左移后会溢出的字符串
 *     新数组： "abc"
 * 然后将原数组左移后再将本来会溢出的字符串填充在右边
 *     左移: "abcXYZdef" -> "XYZdefdef"
 *     填充："XYZdefdef" -> "XYZdefabc" 
 * 
 * 解法2：
 * 假设字符串长度为n，分别翻转字符串前k位和后n-k位
 *     "abcXYZdef" -> "cbafedZYX"
 * 翻转整个字符串
 *     "XYZdefabc"
 *     
 * 这里使用解法2
 * 
 * @author peige
 */
public class _58_02_LeftRotateString {

    public String LeftRotateString(String str,int n) {
        if(str == null || str.length() < 2 || n < 1)
        	return str;
    	n %= str.length();
    	char[] chars = str.toCharArray();
    	reverse(chars, 0, n - 1);
    	reverse(chars, n, chars.length - 1);
    	reverse(chars, 0, chars.length - 1);
    	return new String(chars);
    }
    
	private void reverse(char[] str, int startIndex, int endIndex) {
		for(int low = startIndex, high = endIndex; low < high;
				++low, --high) {
			char t = str[low];
			str[low] = str[high];
			str[high] = t;
		}
	}
}
















