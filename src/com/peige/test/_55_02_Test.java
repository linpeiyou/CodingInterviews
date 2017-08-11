package com.peige.test;

import com.peige.algo._55_02_BalancedBinaryTree;
import com.peige.algo._55_02_BalancedBinaryTree.TreeNode;

public class _55_02_Test {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}

	/**
	 * 功能测试
	 * 树1：
	 *         1
	 *       /   \
	 *      2     3
	 *     / \   / \
	 *    4   5 6   7
	 *   /
	 *  8 
	 *  
	 * 树2：
	 *         1
	 *       /   \
	 *      2     3
	 *     / \   / \
	 *    4   5 6   7
	 *   /   / \
	 *  8   9  10
	 *       \
	 *       11
 	 *  
	 */
	private static void test1() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node4.left = node8;
		
		boolean b = new _55_02_BalancedBinaryTree().IsBalanced_Solution(node1);
		MyTest.equal(b, true);
		
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(10);
		TreeNode node11 = new TreeNode(11);
		node5.left = node9;
		node5.right = node10;
		node9.right = node11;
		
		b = new _55_02_BalancedBinaryTree().IsBalanced_Solution(node1);
		MyTest.equal(b, false);
	}
	
	private static void test2() {
		TreeNode node1 = new TreeNode(1);
		_55_02_BalancedBinaryTree bbt = new _55_02_BalancedBinaryTree();
		boolean b = bbt.IsBalanced_Solution(node1);
		MyTest.equal(b, true);
	}
	
	private static void test3() {
		_55_02_BalancedBinaryTree bbt = new _55_02_BalancedBinaryTree();
		boolean b = bbt.IsBalanced_Solution(null);
		MyTest.equal(b, true);
	}
	
	/**
	 * 提交的时候没过的case：
	 *             1
	 *            /
	 *           2  
	 *          /
	 *         3
	 *        /
	 *       4
	 *      /
	 *     5     
	 */
	private static void test4() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		node1.left = node2;
		node2.left = node3;
		node3.left = node4;
		node4.left = node5;
		
		_55_02_BalancedBinaryTree bbt = new _55_02_BalancedBinaryTree();
		boolean b =bbt.IsBalanced_Solution(node1);
		MyTest.equal(b, false);
	}
}
















