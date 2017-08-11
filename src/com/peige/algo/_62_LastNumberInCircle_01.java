package com.peige.algo;

/**
 * 题目：
 * 圆圈中最后剩下的数字
 * 0, 1, ..., n-1 这n个数字排成一个圆圈，从数字0开始，每次从这个 圆圈里删除第m个数字。
 * 求出这个圆圈里剩下的最后一个数字。
 * 
 * 解法1：
 * 使用循环链表
 * 时间复杂度O(mn)
 * 空间复杂度O(n)
 * 
 * @author peige
 */
public class _62_LastNumberInCircle_01 {
	
	public static class Node {
		public int val;
		public Node next;
		public Node(int val) {
			this.val = val;
		}
	}

    public static int LastRemaining_Solution(int n, int m) {
        if(n < 1 || m < 1)
        	return -1;
        // 构建循环链表 
        Node head = new Node(0);
        Node cur = head;
        for(int i = 1; i < n; ++i) {
        	cur.next = new Node(i);
        	cur = cur.next;
        }
        cur.next = head;
        // 挨个删除元素，cur指向结尾
    	while(n != 1) {
    		// 因为要走到要删除的前一个元素，所以走 m-1 步
    		// 因为多余的 n 的倍数步是在绕圈，所以不用走 
    		int step = (m - 1) % n;
    		// 找到要删的前一个元素
    		for(int i = 0; i < step; ++i) {
    			cur = cur.next;
    		}
    		// 删除元素，cur指向下次开头的前一个元素
    		cur.next = cur.next.next;
    		--n;
    	}
    	return cur.val;
    }
}












