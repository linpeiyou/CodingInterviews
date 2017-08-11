package com.peige.algo;

/**
 * 题目：
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * 
 * 如果当前字符流没有存在出现一次的字符，返回#字符。
 * 
 * @author peige
 */
public class _50_02_FirstCharacterInStream {

	int[] chars;
	private int index;
	
	public _50_02_FirstCharacterInStream() {
		chars = new int[256];
		index = 0;
		for(int i = 0; i < chars.length; ++i) {
			chars[i] = -1;
		}
	}
	
    //Insert one char from stringstream
    public void Insert(char ch) {
        if(chars[ch] == -1)
        	chars[ch] = index;
        else if(chars[ch] >= 0)
        	chars[ch] = -2;
        ++index;
    }
    
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
    	int minIndex = Integer.MAX_VALUE;
    	char ch = '#';
    	for(int i = 0; i < 256; ++i) {
    		if(chars[i] >= 0 && chars[i] < minIndex) {
    			minIndex = chars[i];
    			ch = (char) i;
    		}
    	}
    	return ch;
    }
}














