package com.peige.test;

import com.peige.algo._24_ReverseList;
import com.peige.algo._24_ReverseList.ListNode;

public class _24_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 */
	private static void test1() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		// 4-3-2-1
		node1 = _24_ReverseList.ReverseList(node1);
		printList(node1);
	}
	
	/**
	 * 边界测试
	 * 长度为1
	 */
	private static void test2() {
		ListNode node1 = new ListNode(5);
		node1 = _24_ReverseList.ReverseList(node1);
		printList(node1);
	}
	
	/**
	 * 极端测试 
	 */
	private static void test3() {
		ListNode node1 = _24_ReverseList.ReverseList(null);
		printList(node1);
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













