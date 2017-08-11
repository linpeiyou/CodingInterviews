package com.peige.algo;

/**
 * 题目：
 * 定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点
 * 
 * @author peige
 */
public class _24_ReverseList {
	
	public static class ListNode {
	    public int val;
	    public ListNode next = null;
	    public ListNode(int val) {
	        this.val = val;
	    }
	}
	
    public static ListNode ReverseList(ListNode head) {
    	// 长度为0或1
    	if(head == null || head.next == null)
    		return head;
    	
    	ListNode first = head;
    	ListNode second = head.next;
    	head.next = null;
    	ListNode third;
    	while(second != null) {
    		third = second.next;
    		second.next = first;
    		first = second;
    		second = third;
    	}
    	return first;
    }

}















