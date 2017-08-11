package com.peige.algo;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 * 
 * @author peige
 */
public class _26_SubStructureInTree {

	public static class TreeNode {
	    public int val = 0;
	    public TreeNode left = null;
	    public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
    	if(root1 == null || root2 == null)
    		return false;

    	return findRootWithValue(root1, root2.val, root2);
    }
    
    /**
     * 遍历root1，当找到某个节点值与value相同时，遍历root2和子树root做比较
     */
    public boolean findRootWithValue(TreeNode root, int value, TreeNode root2) {
    	if(root == null)
    		return false;
    	// 找到了根节点值一样的，并且root中包含root2
    	if(root.val == value && compare(root2, root)) {
    		return true;
    	}
    	
    	return findRootWithValue(root.left, value, root2) || 
    			findRootWithValue(root.right, value, root2);
    }

    public boolean compare(TreeNode root, TreeNode rootToBeCompared) {
    	if(root == null)
    		return true;
    	if(rootToBeCompared == null)
    		return false;
    	if(root.val != rootToBeCompared.val)
    		return false;
    	
    	return compare(root.left, rootToBeCompared.left) &&
    			compare(root.right, rootToBeCompared.right);
    }
}















