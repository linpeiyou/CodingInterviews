package com.peige.test;


import com.peige.algo._34_PathInTree;
import com.peige.algo._34_PathInTree.TreeNode;

public class _34_Test {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 功能测试
	 *       8
	 *      / \
	 *     3   6
	 *    / \ / \
	 *   1  7 4  7 
	 *  /
	 * 6
	 */
	private static void test1() {
		TreeNode node1 = new TreeNode(8);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(1);
		TreeNode node5 = new TreeNode(7);
		TreeNode node6 = new TreeNode(4);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(6);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node4.left = node8;
		_34_PathInTree pit = new _34_PathInTree();
		// 3条
		System.out.println(pit.FindPath(node1, 18));
		// 0条
		System.out.println(pit.FindPath(node1, 11));
	}
	
	/**
	 * 边界测试
	 * 1.只有一个节点
	 */
	private static void test2() {
		TreeNode node1 = new TreeNode(1);
		_34_PathInTree pit = new _34_PathInTree();
		// 1条
		System.out.println(pit.FindPath(node1, 1));
		// 0条
		System.out.println(pit.FindPath(node1, 2));
	}
	
	/**
	 * 极端测试
	 * 1.头结点为空
	 */
	private static void test3() {
		_34_PathInTree pit = new _34_PathInTree();
		// 0条
		System.out.println(pit.FindPath(null, 1));
	}
}












