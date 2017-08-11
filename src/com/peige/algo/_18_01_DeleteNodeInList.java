package com.peige.algo;

/**
 * 题目18-1：
 * 在O(1)时间内删除链表节点。
 * 给定单向链表的头指针和一个节点指针，定义一个函数在O(1)时间内删除该节点。
 * 链表节点与函数定义如下：
 * 	public static class ListNode {
 *		int value;
 *		ListNode next;
 *	}
 *
 * 书上的思路：
 * 设链表如下
 * a->b->c->d->e->f
 * 1.如果要删除的节点在链表中间，如要删除节点d，则把e.value和e.next赋值给d，
 *   相当于直接将d节点变成e节点，删除下一个e节点
 * 2.如果要删除的节点是尾节点，只能遍历
 * 3.如果要删除的节点是头结点，则将head指向head的下一个节点
 * 
 * 我的看法：
 * 我不太赞成这个做法，假如要删除节点d，
 * 程序内其他地方此时可能有其他变量指向d或者e节点的内存地址，
 * 此时通过改变d的值来删除节点d，将会影响到其他变量。
 * 所以这个做法只适用于这个题目，不适用于其他情况
 * 
 * 另外一个注意点：
 * 用O(1)时间解决这个问题，基于一个假设：要删除的节点的确在链表中
 * 
 * 
 * 
 * 放弃本题，原因：
 * 我传进来一个头结点 ListNode head，如果链表中只有一个头结点，我没办法将它置为null
 * 
 * @author peige
 */
public class _18_01_DeleteNodeInList {

	public static class ListNode {
		public int value;
		public ListNode next;
		public ListNode(int val) {
			this.value = val;
		}
	}
	
	/**
	 * 放弃本题，原因：
	 * 我传进来一个头结点 ListNode head，如果链表中只有一个头结点，我没办法将它置为null
	 */
	public static void deleteNode(ListNode head, ListNode nodeToBeDeleted) {
		
		
	}
}















