package com.peige.algo;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 * 
 * @author peige
 */
public class _32_03_PrintTreesInZigzag {

	public static class TreeNode {
	    public int val = 0;
	    public TreeNode left = null;
	    public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
    public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	if(pRoot == null)
    		return new ArrayList<>();
    	
    	ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    	ArrayList<Integer> lineResult = new ArrayList<>();
    	
    	LinkedList<TreeNode> oddLineStack = new LinkedList<>();		// 奇数行
    	LinkedList<TreeNode> evenLineStack = new LinkedList<>();	// 偶数行 
    	boolean isOddLineNow = true;	// 正在遍历的是奇数行还是偶数行
    	oddLineStack.addFirst(pRoot);
    	
    	while(!oddLineStack.isEmpty() || !evenLineStack.isEmpty()) {
    		if(isOddLineNow) {
    			while(!oddLineStack.isEmpty()) {
    				TreeNode node = oddLineStack.removeFirst();
    				lineResult.add(node.val);
    				if(node.left != null)
    					evenLineStack.addFirst(node.left);
    				if(node.right != null)
    					evenLineStack.addFirst(node.right);
    			}
    			isOddLineNow = false;
    			result.add(lineResult);
    			lineResult = new ArrayList<>();
    		}
    		else {
    			while(!evenLineStack.isEmpty()) {
    				TreeNode node = evenLineStack.removeFirst();
    				lineResult.add(node.val);
    				if(node.right != null)
    					oddLineStack.addFirst(node.right);
    				if(node.left != null)
    					oddLineStack.addFirst(node.left);
    			}
    			isOddLineNow = true;
    			result.add(lineResult);
    			lineResult = new ArrayList<>();
    		}
    	}
    	return result;
    }
    
}














