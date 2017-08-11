package com.peige.algo;

/**
 * 题目：
 * 输入两个链表，找出它们的第一个公共结点。
 * 
 * 关键：
 * 这题的关键点在于，这两个链表，如果有公共点，
 * 那么从他们的公共点开始，到链表结束，在两个链表中是一致的。
 * 
 * 解法1：
 * 使用两个栈
 * 
 * 解法2：
 * 1.首先遍历两个链表得到它们的长度m, n (m > n)
 * 2.在长度为m的链表上先走m-n步
 * 3.同时在两个链表上遍历，第一个相同的节点就是他们的第一个公共节点
 * 
 * @author peige
 */
public class _52_FirstCommonNodesInLists {

	public static class ListNode {
	    public int val;
	    public ListNode next = null;
	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1 == null || pHead2 == null)
    		return null;
    	int len1 = 0;
    	int len2 = 0;
    	ListNode cur1 = pHead1;
    	ListNode cur2 = pHead2;
    	// 求链表1、链表2长度
    	for(ListNode cur = pHead1; cur != null; cur = cur.next)
    		++len1;
    	for(ListNode cur = pHead2; cur != null; cur = cur.next)
    		++len2;
    	if(len1 > len2) {
    		for(int i = 0; i < len1 - len2; ++i)
    			cur1 = cur1.next;
    	}
    	else {
    		for(int i = 0; i < len2 - len1; ++i)
    			cur2 = cur2.next;
    	}
    	while(cur1 != null) {
    		if(cur1 == cur2)
    			return cur1;
    		cur1 = cur1.next;
    		cur2 = cur2.next;
    	}
    	return null;
    }
}













