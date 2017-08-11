package com.peige.test;

import com.peige.algo._32_01_PrintTreeFromTopToBottom;
import com.peige.algo._32_01_PrintTreeFromTopToBottom.TreeNode;

public class _32_01_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 *     1
	 *    / \
	 *   2   3
	 *  / \   \
	 * 4   5   6
	 */
	private static void test1() {
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		root.left = node2;
		root.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.right = node6;
		System.out.println(_32_01_PrintTreeFromTopToBottom.PrintFromTopToBottom(root));
	}
	
	/**
	 * 边界测试
	 * 1.只有一个节点
	 * 2.每个节点都只有左子节点
	 * 3.每个节点都只有右子节点
	 */
	private static void test2() {
		TreeNode root = new TreeNode(1);
		
		System.out.println(_32_01_PrintTreeFromTopToBottom.PrintFromTopToBottom(root));
		
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		root.left = node2;
		node2.left = node3;
		
		System.out.println(_32_01_PrintTreeFromTopToBottom.PrintFromTopToBottom(root));

		root.left = null;
		node2.left = null;
		root.right = node2;
		node2.right = node3;
		System.out.println(_32_01_PrintTreeFromTopToBottom.PrintFromTopToBottom(root));
	}
	
	/**
	 * 极端测试 
	 * null
	 */
	private static void test3() {
		System.out.println(_32_01_PrintTreeFromTopToBottom.PrintFromTopToBottom(null));
	}
	
}












