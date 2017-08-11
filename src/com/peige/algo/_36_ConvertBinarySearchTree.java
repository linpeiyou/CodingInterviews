package com.peige.algo;

/**
 * 题目：
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * 
 * @author peige
 */
public class _36_ConvertBinarySearchTree {

	public static class TreeNode {
	    public int val = 0;
	    public TreeNode left = null;
	    public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	private TreeNode lastNodeInList;
	
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
        	return null;
        
        lastNodeInList = new TreeNode(0);
        ConvertCore(pRootOfTree);
        
        TreeNode cur = lastNodeInList;
        while(cur.left != null) {
        	cur = cur.left;
        }
        cur = cur.right;
        cur.left = null;
    	return cur;
    }
    
    private void ConvertCore(TreeNode root) {
    	if(root.left != null)
    		ConvertCore(root.left);
    	
    	lastNodeInList.right = root;
    	root.left = lastNodeInList;
    	lastNodeInList = root;
    	
    	if(root.right != null)
    		ConvertCore(root.right);
    }
	
}













