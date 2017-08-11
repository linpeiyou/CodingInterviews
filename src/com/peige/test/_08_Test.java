package com.peige.test;

import com.peige.algo._08_NextNodeInBinaryTrees;
import com.peige.algo._08_NextNodeInBinaryTrees.TreeLinkNode;

public class _08_Test {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	/**
	 *             1
	 *          /     \
	 *         2       3
	 *        / \     / \
	 *       4   5   6   7
	 *          / \      
	 *         8   9
	 *  
	 *  有右子树：2  ->  8 
	 *  没有右子树 & 为父节点的左子节点: 6  ->  3
	 *  没有右子树 & 非父节点的左子节点: 7  ->  null, 9  ->  1
	 *  
	 *  前序：1,2,4,5,8,9,3,6,7
	 *  中序：4,2,8,5,9,1,6,3,7
	 */
	private static void test1() {
		TreeLinkNode n1 = new TreeLinkNode(1);
		TreeLinkNode n2 = new TreeLinkNode(2);
		TreeLinkNode n3 = new TreeLinkNode(3);
		TreeLinkNode n4 = new TreeLinkNode(4);
		TreeLinkNode n5 = new TreeLinkNode(5);
		TreeLinkNode n6 = new TreeLinkNode(6);
		TreeLinkNode n7 = new TreeLinkNode(7);
		TreeLinkNode n8 = new TreeLinkNode(8);
		TreeLinkNode n9 = new TreeLinkNode(9);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n5.left = n8;
		n5.right = n9;
		
		n2.next = n1;
		n3.next = n1;
		n4.next = n2;
		n5.next = n2;
		n6.next = n3;
		n7.next = n3;
		n8.next = n5;
		n9.next = n5;
		
		_08_NextNodeInBinaryTrees nnibt = new _08_NextNodeInBinaryTrees();
		
		// 有右子树
		TreeLinkNode tn1 = nnibt.GetNext(n2);
		System.out.println(tn1 == n8);
		
		// 没有右子树 & 为父节点的左子节点
		TreeLinkNode tn2 = nnibt.GetNext(n6);
		System.out.println(tn2 == n3);
		
		// 没有右子树 & 非父节点的左子节点
		TreeLinkNode tn3 = nnibt.GetNext(n7);
		System.out.println(tn3 == null);
		
		// 没有右子树 & 非父节点的左子节点
		TreeLinkNode tn4 = nnibt.GetNext(n9);
		System.out.println(tn4 == n1);
	}
	
	/**
	 *  只有一个节点
	 */
	private static void test2() {
		_08_NextNodeInBinaryTrees nnibt = new _08_NextNodeInBinaryTrees();
		TreeLinkNode root = new TreeLinkNode(1);
		TreeLinkNode node = nnibt.GetNext(root);
		System.out.println(node == null);
	}
	
	/**
	 * 树为空
	 */
	private static void test3() {
		_08_NextNodeInBinaryTrees nnibt = new _08_NextNodeInBinaryTrees();
		TreeLinkNode root = null;
		TreeLinkNode node = nnibt.GetNext(root);
		System.out.println(node == null);
	}
}















