package com.peige.algo;

import java.util.ArrayList;
import java.util.Collections;

public class _06_PrintListInReversedOrder {
	
	public static class ListNode {
		int val;
		public ListNode next = null;
		public ListNode(int val) {
			this.val = val;
		}
	}	

	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		ListNode current = listNode;
		while(current != null) {
			arrayList.add(current.val);
			current = current.next;
		}
		Collections.reverse(arrayList);
		return arrayList;
	}
}
