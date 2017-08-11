package com.peige.algo;

/**
 * 题目：
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。
 * 后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？ 
 *
 * 思路：
 * 先对整个句子翻转：
 * 		"student. a am I" -> "I ma a .tneduts"
 * 再对每个单词进行逐个翻转（标点符号和普通字母一样处理）：
 * 		"I ma a .tneduts" - > "I am a student."
 * 
 * @author peige
 */
public class _58_01_ReverseWordsInSentence {

    public String ReverseSentence(String str) {
    	if(str == null || str.trim().length() <= 1)
    		return str;
        char[] sentence = str.toCharArray();
    	// 翻转整个句子 
        reverse(sentence, 0, sentence.length - 1);
        int low = 0;
        int high = 0;
        // 翻转每个单词
    	while(low != sentence.length && high != sentence.length) {
    		// 找到第一个非空格字符
    		while(low != sentence.length && sentence[low] == ' ')
    			++low;
    		if(low == sentence.length)
    			break;
    		// 找到low后面的第一个空格字符
    		high = low + 1;
    		while(high != sentence.length && sentence[high] != ' ')
    			++high;
    		reverse(sentence, low, high - 1);
    		low = high + 1;
    	}
    	return new String(sentence);
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















