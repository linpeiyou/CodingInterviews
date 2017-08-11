package com.peige.algo;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 二叉树的镜像定义：
 * 源二叉树： 
 *   	    8
 *   	   /  \
 *   	  6   10
 *   	 / \  / \
 *   	5  7 9  11
 *   
 * 镜像二叉树：
 *   	     8
 *   	   /   \
 *   	  10    6
 *   	 / \   / \
 *   	11  9 7   5
 * 
 * @author peige
 */
public class _27_MirrorOfBinaryTree {
	
	public static class TreeNode {
	    public int val = 0;
	    public TreeNode left = null;
	    public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
    public void Mirror(TreeNode root) {
    	if(root == null) 
    		return;
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
    	Mirror(root.left);
    	Mirror(root.right);
    }
    
}














