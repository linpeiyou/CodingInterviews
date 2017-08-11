package com.peige.algo;

/**
 * 题目：
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 
 * 思路：
 * 递归去找，返回左右子树中较大的值
 * 
 * @author peige
 */
public class _55_01_TreeDepth {

	public static class TreeNode {
	    public int val = 0;
	    public TreeNode left = null;
	    public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public int TreeDepth(TreeNode root) {
		if(root == null)
			return 0;
		int leftDepth = TreeDepth(root.left) + 1;
		int rightDepth = TreeDepth(root.right) + 1;
		return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}











