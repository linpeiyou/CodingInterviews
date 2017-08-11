package com.peige.algo;

/**
 * 题目：
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 
 * 数值为0或者字符串不是一个合法的数值则返回0 
 * 
 * 思路：
 * 其实思路很简单，但是要考虑的非法输入和边界值条件很多
 * 合法的输入：1.数字  2.符号（+-）+ 数字
 * 
 * 非法输入：
 * 1.null
 * 2.字符串为空
 * 3.字符串只有一个符号（+-）
 * 4.字符串中带有非数字字符
 * 5.字符串超过int能表示的范围
 * 
 * @author peige
 */
public class _67_StringToInt {
	
	public boolean isValid = false;

    public int StrToInt(String str) {
        if(str == null || str.trim().equals("")) {
        	return 0;
        }
        int index = 0;
        long result = 0;
        boolean isPositive = true;
        if(str.charAt(0) == '+' || str.charAt(0) == '-') {
        	++index;
        	// 字符串中只有正负号
        	if(index == str.length())
        		return 0;
            if(str.charAt(0) == '-')
            	isPositive = false;
        }
        
        for(int i = index; i < str.length(); ++i) {
        	if(str.charAt(i) < '0' || str.charAt(i) > '9') {
        		return 0;
        	}
        	result *= 10;
        	result += (str.charAt(i) - '0') * (isPositive ? 1 : -1);
        	if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
        		return 0;
        }
    	isValid = true;
    	return (int) result;
    }
}













