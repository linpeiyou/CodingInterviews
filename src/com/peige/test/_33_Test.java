package com.peige.test;

import com.peige.algo._33_SequenceOfBST;

public class _33_Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	/**
	 * 普通测试
	 * 1.完全二叉树
	 *      6
	 *   4    10
	 *  3 5  8  12
 	 * 2.非完全二叉树
 	 *      6
	 *   4    10
	 *  3    8  
	 * 3.没有对应的二叉树
	 */
	private static void test1() {
		_33_SequenceOfBST sobst = new _33_SequenceOfBST();
		boolean b = sobst.VerifySquenceOfBST(new int[] {3,5,4,8,12,10,6});
		MyTest.equal(b, true);
		
		b = sobst.VerifySquenceOfBST(new int[] {3,4,8,10,6});
		MyTest.equal(b, true);
		
		b = sobst.VerifySquenceOfBST(new int[] {7,4,6,5});
		MyTest.equal(b, false);
	}
	
	/**
	 * 边界测试
	 * 1.只有一个节点的二叉树
	 * 2.只有左子节点的二叉树
	 * 3.只有右子节点的二叉树
	 */
	private static void test2() {
		_33_SequenceOfBST sobst = new _33_SequenceOfBST();
		boolean b = sobst.VerifySquenceOfBST(new int[] {3});
		MyTest.equal(b, true);
		
		b = sobst.VerifySquenceOfBST(new int[] {1,2,6,8});
		MyTest.equal(b, true);
		
		b = sobst.VerifySquenceOfBST(new int[] {8,6,2,1});
		MyTest.equal(b, true);
	}
	
	/**
	 * 极端测试
	 * 1.输入null
	 * 2.数组长度为0
	 */
	private static void test3() {
		_33_SequenceOfBST sobst = new _33_SequenceOfBST();
		boolean b = sobst.VerifySquenceOfBST(null);
		MyTest.equal(b, false);
		
		b = sobst.VerifySquenceOfBST(new int[0]);
		MyTest.equal(b, false);
	}
	
}











