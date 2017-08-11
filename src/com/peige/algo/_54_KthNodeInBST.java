package com.peige.algo;

/**
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。
 * 例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
 * 
 * @author peige
 */
public class _54_KthNodeInBST {
	
	public static class TreeNode {
	    public int val = 0;
	    public TreeNode left = null;
	    public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}

	private int kth = 0;
	
    public TreeNode KthNode(TreeNode pRoot, int k) {
    	if(pRoot == null || k <= 0)
    		return null;
    	TreeNode result = KthNode(pRoot.left, k);
    	if(kth == k)
    		return result;
    	if(++kth == k)
    		return pRoot;
    	result = KthNode(pRoot.right, k);
    	return result;
    }
}
