package com.peige.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import com.peige.algo._06_PrintListInReversedOrder;
import com.peige.algo._06_PrintListInReversedOrder.ListNode;

public class _06_Test {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	/**
	 * 功能测试
	 * 1.链表有多个节点
	 * 2.链表只有一个节点
	 */
	private static void test1() {
		ListNode head1 = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		head1.next = node1;
		node1.next = node2;
		node2.next = node3;
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(4,3,2,1));
		ArrayList<Integer> arr2 = _06_PrintListInReversedOrder.printListFromTailToHead(head1);
		MyTest.equal(arr1.equals(arr2), true);
		
		ListNode head2 = new ListNode(99);
		ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(99));
		ArrayList<Integer> arr4 = _06_PrintListInReversedOrder.printListFromTailToHead(head2);
		MyTest.equal(arr3.equals(arr4), true);
	}
	
	/**
	 * 特殊输入测试
	 * 输入的链表头结点为null
	 */
	private static void test2() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Integer> arr2 = _06_PrintListInReversedOrder.printListFromTailToHead(null);
		MyTest.equal(arrayList.equals(arr2), true);
	}
}


















