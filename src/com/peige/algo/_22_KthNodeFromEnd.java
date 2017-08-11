package com.peige.algo;

/**
 * 题目：
 * 输入一个链表，输出该链表中倒数第k个节点。
 * 为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有6个节点，从头结点开始，它们的值以此是1、2、3、4、5、6。
 * 这个链表的倒数第3个节点是值为4的节点。
 * 
 * @author peige
 */
public class _22_KthNodeFromEnd {

	public static class ListNode {
	    public int val;
	    public ListNode next = null;
	    public ListNode(int val) {
	        this.val = val;
	    }
	}
	
    public static ListNode FindKthToTail(ListNode head, int k) {
    	if(head == null || k <= 0)
    		return null;
    	
    	ListNode node1 = head;
    	ListNode node2 = head;
    	for(int i = 0; i < k - 1; ++i) {
    		node1 = node1.next;
    		if(node1 == null)
    			return null;
    	}
    	
    	while(node1.next != null) {
    		node1 = node1.next;
    		node2 = node2.next;
    	}
    	return node2;
    }
    
}













