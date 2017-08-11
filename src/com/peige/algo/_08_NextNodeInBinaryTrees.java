package com.peige.algo;


/**
 * 题目：
 * 给定一棵二叉树和其中的一个节点，
 * 如何找出中序遍历的下一个节点？
 * 树中的节点除了有两个分别指向左、右节点的指针，还有一个指向父节点的指针
 * 
 * @author peige
 */
public class _08_NextNodeInBinaryTrees {

	public static class TreeLinkNode {
	    public int val;
	    public TreeLinkNode left = null;
	    public TreeLinkNode right = null;
	    // 指向父节点，这个名字取得不好呀，应该叫parent
	    public TreeLinkNode next = null;	
	    public TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	
	/**
	 * 首先判断node是否有右子树？
	 *   ->有右子树则返回右子树中最左的节点
	 *   没有右子树的话判断node是否为父节点的左子节点？
	 *     ->是的话直接返回父节点
	 *     不是的话则沿着父节点往上（parent）寻找，
	 *     直到某个节点node2，node2为其父节点node3的左子节点，返回node3   
	 * 
	 * @param node 节点
	 * @return 中序遍历的下一个节点
	 */
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode == null)
        	return null;
        // 右子树不为空 
    	if(pNode.right != null) {
    		return findLeft(pNode.right);
    	}
    	// 是父节点的左子节点
    	if(pNode.next != null && pNode == pNode.next.left) {
    		return pNode.next;
    	}
    	TreeLinkNode cur = pNode;
    	while(cur.next != null && cur != cur.next.left) {
    		cur = cur.next;
    	}
    	// 遍历到了根节点还是没找到
    	if(cur.next == null)
    		return null;
    	return cur.next;
    }
	
    private TreeLinkNode findLeft(TreeLinkNode pNode) {
    	TreeLinkNode cur = pNode;
    	while(cur.left != null) {
    		cur = cur.left;
    	}
    	return cur;
    }
}




















