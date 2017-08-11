package com.peige.algo;

/**
 * 题目：
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后续遍历结果。
 * 如果是则返回true，否则返回false。
 * 假设输入的数组的任意两个数字互不相同。
 * 
 * 例如，输入数组{5, 7, 6, 9, 11, 10, 8}，则返回true，因为这个整数序列是
 * 下面这个二叉搜索树的后序遍历结果。如果输入的数组是{7, 4, 6, 5}，则由于没有
 * 哪棵二叉搜索树的后序遍历结果是这个序列，因此返回false。
 *     8
 *    / \
 *   6  10
 *  / \ / \
 * 5  7 9 11
 * 
 * 思路：
 * 首先分析一下两个点：1.二叉搜索树   2.后续遍历
 * 注：题目表示无重复数字
 * 1.二叉搜索树的特点：左子节点 < 根节点 < 右子节点
 * 2.后续遍历的特点：遍历顺序为左->右->根，最后一个节点为树的根节点
 * 
 * 所以，符合题意的数组可以分成三个部分：
 * [{1.小于根节点},{2.大于根节点},3.根节点]
 * 然后1、2又是原问题的子问题
 * 所以可以递归解决
 * 
 * @author peige
 */
public class _33_SequenceOfBST {

	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0)
        	return false;
		return VerifySequenceOfBST(sequence, 0, sequence.length - 1);
    }
	
	private boolean VerifySequenceOfBST(int[] sequence, int from, int to) {
		if(to - from <= 1)
			return true;
		
		int root = sequence[to];
		int preIndex = from;
		int lastIndex = to - 1;

		while(preIndex <= lastIndex) {
			if(sequence[preIndex] > root) {
				break;
			}
			++preIndex;
		}
		while(lastIndex >= from) {
			if(sequence[lastIndex] < root) {
				break;
			}
			--lastIndex;
		}
		
		if(preIndex == lastIndex + 1)
			return VerifySequenceOfBST(sequence, from, lastIndex) &&
					VerifySequenceOfBST(sequence, preIndex, to - 1);
		
		return false;
	}
}














