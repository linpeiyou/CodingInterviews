package com.peige.algo;

/**
 * 题目：
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * 
 * @author peige
 */
public class _18_02_DeleteDuplicatedNode {

	public static class ListNode {
	    public int val;
	    public ListNode next = null;
	    public ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public static ListNode deleteDuplication(ListNode pHead)
    {
		if(pHead == null || pHead.next == null)
			return pHead;
		
		ListNode newHead = new ListNode(0);
		ListNode node = newHead;
		boolean flag = true;

		ListNode tmpNode = pHead;
		ListNode current = pHead;
		
		while((current = current.next) != null) {
			if(current.val == tmpNode.val) {
				flag = false;
			}
			// 之前没有重复元素
			else if(flag == true) {
				node.next = tmpNode;
				node = node.next;
				tmpNode = current;
			}
			// 之前有重复元素
			else {
				tmpNode = current;
				flag = true;
			}
		}
		if(flag == true)
			node.next = tmpNode;
		else 
			node.next = null;
		return newHead.next;
    }
}














