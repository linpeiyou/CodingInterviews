package com.peige.algo;

/**
 * 题目：
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，
 * 一个指向下一个节点，另一个特殊指针指向任意一个节点或者null），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * 
 * 
 * 思路：
 * 解法1（我一开始的想法）：
 * 1.先对所有的node进行copy，并用next连接起来。
 *   copy的同时将原node和copy之后的node放在哈希表中。
 * 2.处理random
 * 
 * 解法2：
 * 1.第一步：根据原始链表的每个节点N创建对应的N'。把N'链接在N的后面。
 * 2.第二步：设置复制出来的节点的random
 * 3.第三步：把这个长链表拆分成两个链表
 * 
 * 这里的代码实现采用解法2
 * 
 * 测试：
 * 不想测试啊，好麻烦
 * 
 * @author peige
 */
public class _35_CopyComplexList {

	public static class RandomListNode {
	    public int label;
	    public RandomListNode next = null;
	    public RandomListNode random = null;
	    RandomListNode(int label) {
	        this.label = label;
	    }
	}
	
	
	public RandomListNode Clone(RandomListNode pHead) {
		if(pHead == null)
			return null;
		copyList(pHead);
		handleRandom(pHead);
		return split(pHead);
    }
	
	/**
	 * 第一步：根据原始链表的每个节点N创建对应的N'。把N'链接在N的后面。
	 */
	private void copyList(RandomListNode pHead) {
		RandomListNode cur = pHead;
		while(cur != null) {
			RandomListNode node = new RandomListNode(cur.label);
			node.next = cur.next;
			cur.next = node;
			cur = node.next;
		}
	}
	
	/**
	 * 第二步：设置复制出来的节点的random
	 */
	private void handleRandom(RandomListNode pHead) {
		RandomListNode cur = pHead;
		while(cur != null) {
			if(cur.random != null) {
				cur.next.random = cur.random.next;
			}
			cur = cur.next.next;
		}
	}
	
	/**
	 * 第三步：把这个长链表拆分成两个链表
	 */
	private RandomListNode split(RandomListNode pHead) {
		RandomListNode newHead = pHead.next;
		RandomListNode cur = pHead;
		RandomListNode newCur = newHead;
		for(;;) {
			cur.next = newCur.next;
			cur = cur.next;
			if(cur == null)
				break;
			newCur.next = cur.next;
			newCur = newCur.next;
		}
		return newHead;
	}
}













