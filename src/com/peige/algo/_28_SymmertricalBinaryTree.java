package com.peige.algo;

/**
 * 题目：
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * 
 * 思路：
 * 从根节点的左右两个子节点出发
 * 左子节点采用 根左右 的方式遍历
 * 右子节点采用 左根右 的方式遍历
 * 每遍历一次就进行比较，一旦出现不同的值就表示不是对称的
 * 
 * 测试（代码复杂，直接用脑袋测试了）：
 * 1.正常的对称二叉树（功能测试）
 * 2.正常的非对称二叉树（功能测试）
 * 3.只有头结点的二叉树（边界测试）
 * 4.输入的头结点为null（极端测试）
 * 
 * PS：我在提交牛客网的时候，如果头结点为null，应该输出true，
 *     我当时输出了false，这个让我挂了一次
 * 
 * @author peige
 */
public class _28_SymmertricalBinaryTree {

	public static class TreeNode {
	    public int val = 0;
	    public TreeNode left = null;
	    public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public boolean isSymmetrical(TreeNode pRoot) {
    	if(pRoot == null) 
    		return true;

    	return isSymmetrical(pRoot.left, pRoot.right);
    }
    
    /**
     * root1使用根左右遍历
     * root2使用根右左遍历 
     */
    public boolean isSymmetrical(TreeNode root1, TreeNode root2) {
    	if(root1 == null && root2 == null)
    		return true;
    	if(root1 == null || root2 == null)
    		return false;
    	
    	if(root1.val != root2.val)
    		return false;
    	
    	return isSymmetrical(root1.left, root2.right) &&
    			isSymmetrical(root1.right, root2.left);
    }
    
}














