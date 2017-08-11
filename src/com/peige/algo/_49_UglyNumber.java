package com.peige.algo;

/**
 * 题目：
 * 我们把只包含因子2、3 和 5 的数称作丑数(Ugly Number)
 * 求按照从小到大的顺序的第1500个丑数。
 * 例如，6、8都是丑数，但是14不是，因为它包含因子7。习惯上我们把1当做第一个丑数。
 * 
 * @author peige
 */
public class _49_UglyNumber {

    public int GetUglyNumber_Solution(int index) {
    	if(index <= 0)
    		return 0;
    	int uglyNumbers[] = new int[index];
    	uglyNumbers[0] = 1;
    	int count = 1;
    	int indexOf2 = 0;
    	int indexOf3 = 0;
    	int indexOf5 = 0;
    	int numOf2, numOf3, numOf5;

    	while(count < index) {
    		numOf2 = uglyNumbers[indexOf2] * 2;
    		numOf3 = uglyNumbers[indexOf3] * 3;
    		numOf5 = uglyNumbers[indexOf5] * 5;
    		int min = min(numOf2, numOf3, numOf5);
    		if(min == numOf2)
    			indexOf2++;
    		if(min == numOf3)
    			indexOf3++;
    		if(min == numOf5)
    			indexOf5++;
    		uglyNumbers[count++] = min;
    	}
        return uglyNumbers[index - 1];
    }
    
    private int min(int a, int b, int c) {
    	return a < b ? (a < c ? a : c)
    			: (b < c ? b : c);
    }
    
}



















