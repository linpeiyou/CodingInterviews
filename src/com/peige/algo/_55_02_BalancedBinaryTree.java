package com.peige.algo;

/**
 * 题目：
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
 * 如果某二叉树中的任意节点的左、右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 * 
 * ps：根节点为null时返回true
 * 
 * @author peige
 */
public class _55_02_BalancedBinaryTree {
	
	public static class TreeNode {
	    public int val = 0;
	    public TreeNode left = null;
	    public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public boolean IsBalanced_Solution(TreeNode root) {
		if(root == null)
			return true;
		int res = treeDepth(root);
		if(res == -1)
			return false;
		return true;
    }
	
	/**
	 * 一旦出现不平衡的节点，开始递归返回-1 
	 */
	public int treeDepth(TreeNode root) {
		if(root == null)
			return 0;
		int leftDepth = treeDepth(root.left);
		if(leftDepth == -1)
			return -1;
		int rightDepth = treeDepth(root.right);
		if(rightDepth == -1)
			return -1;
		// 该节点是否平衡
		if(leftDepth - rightDepth > 1 || leftDepth - rightDepth < -1)
			return -1;
		// 加上根节点的长度（后序遍历）
		return leftDepth > rightDepth ? leftDepth + 1: rightDepth + 1;
	}
}














