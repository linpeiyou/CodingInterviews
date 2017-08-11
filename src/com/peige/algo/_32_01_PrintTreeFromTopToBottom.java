package com.peige.algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 
 * @author peige
 */
public class _32_01_PrintTreeFromTopToBottom {

	public static class TreeNode {
		public int val = 0;
		public TreeNode left = null;
		public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		if(root == null)
			return new ArrayList<>();
		
		ArrayList<Integer> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode node = queue.poll();
			list.add(node.val);
			if(node.left != null)
				queue.add(node.left);
			if(node.right != null)
				queue.add(node.right);
		}
		return list;
    }
}

















