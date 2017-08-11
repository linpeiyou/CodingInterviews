package com.peige.algo;

public class _05_ReplaceSpaces {

	public static String replaceSpace(StringBuffer str) {
		int oldLen = str.length();
		int len = oldLen;
		for(int i = 0; i < str.length(); ++i) {
			if(str.charAt(i) == ' ')
				len += 2;
		}
		str.setLength(len);
		
		for(int i = oldLen - 1, j = len - 1; i >= 0; ) {
			if(str.charAt(i) == ' ') {
				str.setCharAt(j--, '0');
				str.setCharAt(j--, '2');
				str.setCharAt(j--, '%');
				--i;
			}
			else {
				str.setCharAt(j--, str.charAt(i--));
			}
		}
		return str.toString();
	}
	
}
