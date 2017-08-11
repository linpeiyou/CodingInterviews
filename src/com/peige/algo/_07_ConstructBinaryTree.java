package com.peige.algo;

public class _07_ConstructBinaryTree {

	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
		public TreeNode(int x) {
			this.val = x;
		}
	}
	
	private static final int LEFT = 0;
	private static final int RIGHT = 1;
	/**
	 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
	 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
	 * 
	 * @param pre	前序遍历
	 * @param in	中序遍历
	 * @return	该二叉树
	 */
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if(pre.length == 0 || in.length == 0)
			return null;
		TreeNode root = new TreeNode(0);
		buildTree(root, root, pre, 0, pre.length, in, 0, in.length, LEFT);
		if(root == null) 
			return null;
		root = root.left;
		return root;
	}
	
	public static void buildTree(TreeNode root, TreeNode sonRoot, int[] pre, int preStart, int preEnd,
			int[] in, int inStart, int inEnd, int leftOrRight) {
		
		if(sonRoot == null || preStart >= preEnd || inStart >= inEnd)
			return;
		TreeNode newRoot = null;
		int value = pre[preStart];	// 根节点的值 
		int leftLen = 0;			// 左子树节点个数
		int i;
		for(i = inStart; i < inEnd; ++i) {
			if(in[i] == value) {
				leftLen = i - inStart;
				break;
			}
		}
		// 前序遍历和中序遍历不匹配
		if(i == inEnd) {
			root = null;
			return;
		}
		if(leftOrRight == LEFT) {
			sonRoot.left = new TreeNode(value);
			newRoot = sonRoot.left;
		}
		else {
			sonRoot.right = new TreeNode(value);
			newRoot = sonRoot.right;
		}
		buildTree(root, newRoot, pre, preStart+1, preStart+1+leftLen, in, inStart, inStart+leftLen, LEFT);
		buildTree(root, newRoot, pre, preStart+1+leftLen, preEnd, in, inStart+leftLen+1, inEnd, RIGHT);
	}
	
}
















