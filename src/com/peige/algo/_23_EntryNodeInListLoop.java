package com.peige.algo;

/**
 * 题目：
 * 一个链表中包含环，请找出该链表的环的入口节点。
 * 
 * 思路：
 * 1.先判断链表中是否包含环
 *   （node1，node2指向头结点，node1每次向前移动1步，node2每次向前移动2步，
 *     若出现node1==node2，则有环，若node2==null，则无环）
 * 2.若链表中存在环，则统计环的节点个数count
 * 3.寻找环的入口节点
 *   （node1，node2指向头结点，node1先向前移动count步，
 *     然后node1和node2每次向前移动1步，当node1==node2时，则为环的入口节点）
 * 
 * 测试1：
 * 功能测试：
 * 1.没有环的链表
 * 2.有环的链表
 * 
 * 边界测试：
 * 1.只有一个节点的链表
 * 2.整个都是环的链表
 * 
 * 极端测试：
 * 1.链表头节点为null
 * 
 * @author peige
 */
public class _23_EntryNodeInListLoop {

	public static class ListNode {
	    public int val;
	    public ListNode next = null;
	    public ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null)
        	return null;
		// 判断是否存在环
        ListNode node1 = pHead;
        ListNode node2 = pHead;
        while(node2 != null) {
        	node2 = node2.next;
        	if(node2 == null)
        		return null;
        	node2 = node2.next;
        	node1 = node1.next;
        	if(node1 == node2)
        		break;
        }
        if(node2 == null)
        	return null;
        // 统计环的节点个数
        int count = 1;
        ListNode cur = node2.next;
        while(cur != node2) {
        	++count;
        	cur = cur.next;
        }
        // 找到环的入口结点
        node1 = pHead;
        node2 = pHead;
        while(count-- != 0) {
        	node2 = node2.next;
        }
        while(node1 != node2) {
        	node1 = node1.next;
        	node2 = node2.next;
        }
		return node1;
    }
	
}

















