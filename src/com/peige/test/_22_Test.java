package com.peige.test;

import com.peige.algo._22_KthNodeFromEnd;
import com.peige.algo._22_KthNodeFromEnd.ListNode;

public class _22_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 * 1-2-3-4-5
	 */
	private static void test1() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		ListNode n1 = _22_KthNodeFromEnd.FindKthToTail(node1, 1);
		MyTest.equal(n1, node5);
		ListNode n2 = _22_KthNodeFromEnd.FindKthToTail(node1, 3);
		MyTest.equal(n2, node3);
		ListNode n3 = _22_KthNodeFromEnd.FindKthToTail(node1, 5);
		MyTest.equal(n3, node1);
	}
	
	/**
	 * 边界测试
	 */
	private static void test2() {
		ListNode node1 = new ListNode(1);
		ListNode n1 = _22_KthNodeFromEnd.FindKthToTail(node1, 1);
		MyTest.equal(n1, node1);
	}
	
	/**
	 * 极端测试
	 * 1.链表为null
	 * 2.k为0
	 * 3.k为负数
	 * 4.k大于链表长度
	 */
	private static void test3() {
		ListNode n1 = _22_KthNodeFromEnd.FindKthToTail(null, 1);
		System.out.println(n1 == null);
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		ListNode n2 = _22_KthNodeFromEnd.FindKthToTail(node1, 0);
		System.out.println(n2 == null);
		ListNode n3 = _22_KthNodeFromEnd.FindKthToTail(node1, -1);
		System.out.println(n3 == null);
		ListNode n4 = _22_KthNodeFromEnd.FindKthToTail(node1, 6);
		System.out.println(n4 == null);
	}
}













