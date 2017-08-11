package com.peige.test;

import com.peige.algo._18_01_DeleteNodeInList;
import com.peige.algo._18_01_DeleteNodeInList.ListNode;

/**
 * 放弃本题，原因：
 * 我传进来一个头结点 ListNode head，如果链表中只有一个头结点，我没办法将它置为null
 */
public class _18_01_Test {
	
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
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;

		// 1-2-4-5-6
		_18_01_DeleteNodeInList.deleteNode(node1, node3);
		printListNode(node1);
		
		// 1-2-4-5
		_18_01_DeleteNodeInList.deleteNode(node1, node6);
		printListNode(node1);
		
		// 2-4-5
		_18_01_DeleteNodeInList.deleteNode(node1, node1);
		printListNode(node1);
	}
	
	/**
	 * 边界测试
	 * 1.只有一个节点
	 */
	private static void test2() {
		// null
		ListNode head1 = new ListNode(1);
		_18_01_DeleteNodeInList.deleteNode(head1, head1);
		printListNode(head1);
	}
	
	/**
	 * 极端测试
	 * 1.head为null
	 * 2.nodeToBeDeleted为null
	 */
	private static void test3() {
		// null
		ListNode head1 = null;
		_18_01_DeleteNodeInList.deleteNode(head1, head1);
		printListNode(head1);

		// 2
		ListNode head2 = new ListNode(2);
		_18_01_DeleteNodeInList.deleteNode(head2, null);
		printListNode(head2);
	}

	private static void printListNode(ListNode head) {
		ListNode cur = head;
		while(cur != null) {
			System.out.print(cur.value + " ");
			cur = cur.next;
		}
		System.out.println();
	}
}











