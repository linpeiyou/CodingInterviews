package com.peige.test;

import com.peige.algo._54_KthNodeInBST;
import com.peige.algo._54_KthNodeInBST.TreeNode;

public class _54_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 *        8
	 *      /   \
	 *     6    12
	 *    / \   / \
	 *   3  7  10 14
	 */
	private static void test1() {
		TreeNode node1 = new TreeNode(8);
		TreeNode node2 = new TreeNode(6);
		TreeNode node3 = new TreeNode(12);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(7);
		TreeNode node6 = new TreeNode(10);
		TreeNode node7 = new TreeNode(14);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		
		_54_KthNodeInBST knib = new _54_KthNodeInBST();
		TreeNode n = knib.KthNode(node1, 3);
		System.out.println(n == node5);
		
		_54_KthNodeInBST knib2 = new _54_KthNodeInBST();
		n = knib2.KthNode(node1, 4);
		System.out.println(n == node1);
		
		_54_KthNodeInBST knib3 = new _54_KthNodeInBST();
		n = knib3.KthNode(node1, 1);
		System.out.println(n == node4);
		
		_54_KthNodeInBST knib4 = new _54_KthNodeInBST();
		n = knib4.KthNode(node1, 7);
		System.out.println(n == node7);
		
		_54_KthNodeInBST knib5 = new _54_KthNodeInBST();
		n = knib5.KthNode(node1, 8);
		System.out.println(n);
		
		_54_KthNodeInBST knib6 = new _54_KthNodeInBST();
		n = knib6.KthNode(node1, 0);
		System.out.println(n);
	}
	
	private static void test2() {
		TreeNode node1 = new TreeNode(1);
		_54_KthNodeInBST knib = new _54_KthNodeInBST();
		TreeNode n = knib.KthNode(node1, 1);
		System.out.println(node1 == n);
	}
	
	private static void test3() {
		_54_KthNodeInBST knib = new _54_KthNodeInBST();
		TreeNode n = knib.KthNode(null, 1);
		System.out.println(n);
	}
}
















