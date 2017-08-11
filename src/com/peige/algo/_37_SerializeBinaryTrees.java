package com.peige.algo;

/**
 * 题目：
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * 
 * @author peige
 */
public class _37_SerializeBinaryTrees {

	public static class TreeNode {
	    public int val = 0;
	    public TreeNode left = null;
	    public TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	/**
	 * 序列化
	 */
    public String Serialize(TreeNode root) {
    	if(root == null)
    		return "$";
    	StringBuilder sb = new StringBuilder();
    	Serialize(root, sb);
    	return sb.toString();
    }
    
    private void Serialize(TreeNode root, StringBuilder sb) {
    	if(root == null) {
    		sb.append("$");
    		return;
    	}
    	sb.append(root.val);
    	Serialize(root.left, sb.append(","));
    	Serialize(root.right, sb.append(","));
    }
    
    
    private int index;
    /**
     * 反序列化
     */
    public TreeNode Deserialize(String str) {
    	if(str == null || str.trim().length() == 0)
    		return null;
    	String[] nums = str.split(",");
    	index = 0;
    	return Deserialize(nums);
    }
    
    public TreeNode Deserialize(String[] nums) {
    	if(nums[index].equals("$")) {
    		++index;
    		return null;
    	}
    	TreeNode node = new TreeNode(Integer.valueOf(nums[index++]));
    	node.left = Deserialize(nums);
    	node.right = Deserialize(nums);
    	return node;
    }
}














