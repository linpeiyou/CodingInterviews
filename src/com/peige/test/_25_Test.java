package com.peige.test;

import com.peige.algo._25_MergeSortedLists;
import com.peige.algo._25_MergeSortedLists.ListNode;

public class _25_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 */
	private static void test1() {
		// 1-2-3-3-4-6-7-8
		ListNode list1 = createList(1,3,4,8);
		ListNode list2 = createList(2,3,6,7);
		ListNode head1 = _25_MergeSortedLists.Merge(list1, list2);
		printList(head1);
	}
	
	/**
	 * 边界测试
	 */
	private static void test2() {
		// 4-6
		ListNode list1 = createList(6);
		ListNode list2 = createList(4);
		ListNode head1 = _25_MergeSortedLists.Merge(list1, list2);
		printList(head1);
	}
	
	/**
	 * 极端测试 
	 * 1.list1为null
	 * 2.list2为null
	 * 3.list1和list2都为null 
	 */
	private static void test3() {
		ListNode list1 = createList(1);
		ListNode list2 = createList(2);
		
		ListNode head1 = _25_MergeSortedLists.Merge(list1, null);
		ListNode head2 = _25_MergeSortedLists.Merge(null, list2);
		ListNode head3 = _25_MergeSortedLists.Merge(null, null);
		
		printList(head1);
		printList(head2);
		printList(head3);
	}
	
	private static ListNode createList(int... vals) {
		ListNode head = new ListNode(0);
		ListNode cur = head;
		for(int val : vals) {
			cur.next = new ListNode(val);
			cur = cur.next;
		}
		return head.next;
	}
	
	private static void printList(ListNode head) {
		ListNode cur = head;
		while(cur != null) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
		System.out.println();
	}
}
