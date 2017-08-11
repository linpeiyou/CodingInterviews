package com.peige.algo;

import java.util.ArrayList;
import java.util.LinkedList;

/** 
 * 题目：
 * 输入一棵二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * 
 * 思路：
 * 使用前序遍历，然后用栈保存路径，并统计当前路径的sum。
 * 当某个节点已经不在路径内，这个节点要出栈，并从sum中减去对应的值。  
 * ps:因为打印路径的时候需要遍历这个栈，所以这个栈结构最好能遍历。
 * 
 * @author peige
 */
public class _34_PathInTree {

	public static class TreeNode {
	    public int val = 0;
	    public TreeNode left = null;
	    public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	private int sum;
	LinkedList<Integer> stack;
	ArrayList<ArrayList<Integer>> result;
	
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	if(root == null)
    		return new ArrayList<>();
    	stack = new LinkedList<>();
    	result = new ArrayList<>(); 
    	sum = 0;
    	FindPathCore(root, target);
    	return result;
    }
    
    private void FindPathCore(TreeNode root, int target) {
    	sum += root.val;
    	stack.addFirst(root.val);
    	if(root.left != null)
    		FindPathCore(root.left, target);
    	if(root.right != null)
    		FindPathCore(root.right, target);
    	// 叶子节点
    	if(root.left == null && root.right == null) {
    		if(sum == target) {
    			ArrayList<Integer> path = new ArrayList<>();
    			for(int i = stack.size() - 1; i >= 0; --i) {
    				path.add(stack.get(i));
    			}
    			result.add(path);
    		}
    	}
    	sum -= root.val;
    	stack.removeFirst();
    }
}













