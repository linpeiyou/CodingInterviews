package com.peige.algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 
 * @author peige
 */
public class _32_02_PrintTreesInLines {

	public static class TreeNode {
		public int val = 0;
		public TreeNode left = null;
		public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if(pRoot == null)
        	return new ArrayList<>();
    	
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        
        ArrayList<Integer> lineResult = new ArrayList<>();
        int numOfThisLine = 1;
        int numOfNextLine = 0;
        
        while(!queue.isEmpty()) {
        	TreeNode node = queue.poll();
        	lineResult.add(node.val);
        	--numOfThisLine;
        	if(node.left != null) {
        		queue.add(node.left);
        		++numOfNextLine;
        	}
        	if(node.right != null) {
        		queue.add(node.right);
        		++numOfNextLine;
        	}
        	if(numOfThisLine == 0) {
        		result.add(lineResult);
        		lineResult = new ArrayList<>();
        		numOfThisLine = numOfNextLine;
        		numOfNextLine = 0;
        	}
        }
    	return result;
    }
}












