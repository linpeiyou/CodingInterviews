package com.peige.algo;

/**
 * 题目：
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * 例如：
 * 链表1：1->3->5->7
 * 链表2：2->4->6->8
 * 合并后：1->2->3->4->5->6->7->8
 * 
 * @author peige
 */
public class _25_MergeSortedLists {
	
	public static class ListNode {
	    public int val;
	    public ListNode next = null;
	    public ListNode(int val) {
	        this.val = val;
	    }
	}

    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
        	return list2;
        if(list2 == null)
        	return list1;
        
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(list1 != null && list2 != null) {
        	if(list1.val > list2.val) {
        		cur.next = list2;
        		list2 = list2.next;
        		cur = cur.next;
        	}
        	else {
        		cur.next = list1;
        		list1 = list1.next;
        		cur = cur.next;
        	}
        }
        
    	if(list1 != null)
    		cur.next = list1;
    	else if(list2 != null)
    		cur.next = list2;
    	
    	return head.next;
    }
    
}
