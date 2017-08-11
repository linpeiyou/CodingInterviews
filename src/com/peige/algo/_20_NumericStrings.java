package com.peige.algo;

/**
 * 题目：
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * 
 * 思路：
 * 数字有如下两种情况：
 * A[.B][e|EC]
 * [+|-].B[e|EC]
 * 
 * 其中A、C表示数字（带符号或不带符号 ），B表示不带符号的数字
 * []包含的整个部分可有可无，
 * 即：如果是第一种类型 A必须有，[.B]可以有，[e|EC]可以有
 *     如果是第二种类型 [+|-]可以有，.B必须有，[e|EC]可以有
 *     
 *     
 * 第一次挂：-.123应该输出true
 * 第二次挂：12e应该输出false
 * 第三次挂：+-5应该输出false 
 * 
 * @author peige
 */
public class _20_NumericStrings {

	private int index;
	
	public boolean isNumeric(char[] str) {
		if(str == null || str.length == 0)
			return false;
		index = 0;
		boolean isNumeric = false;
		// 走到 A↓[.B][e|EC]  或者  [+|-]↓.B[e|EC]
		isNumeric = isNumericCore(str);
		// 走到 A[.B]↓[e|EC]  或者  [+|-].B↓[e|EC]
		if(index != str.length && str[index] == '.') {
			++index;
			isNumeric = isUnsignedNumeric(str);
		}
		// 必须有的A或者.B都没有
		if(isNumeric == false)
			return false;
		
		if(index != str.length && (str[index] == 'e' || str[index] == 'E')) {
			++index;
			isNumeric = isNumericCore(str);
		}
		return isNumeric && index == str.length;
    }
	

	private boolean isUnsignedNumeric(char[] str) {
		boolean hasNumeric = false;
		while(index < str.length) {
			if('0' <= str[index] && str[index] <= '9') {
				hasNumeric = true;
				++index;
				continue;
			}
			break;
		}
		return hasNumeric;
	}

	private boolean isNumericCore(char[] str) {
		if(index >= str.length)
			return false;
		if(str[index] == '+' || str[index] == '-')
			++index;
		return isUnsignedNumeric(str);
	}
}












