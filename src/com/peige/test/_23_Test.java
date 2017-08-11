package com.peige.test;

import java.util.ArrayList;

/**
 * 测试用例在代码注释里
 * 偷懒用大脑测试了
 * 
 * @author peige
 */
public class _23_Test {

	public ArrayList<Integer> printMatrix(int [][] matrix) {
	       
		
		return null;
    }
	
	public void buildMatrix(ArrayList<Integer> list, int[][] matrix, int x, int y,
			int xTop, int xBottom, int yLeft, int yRight, int matrixLength, int count) {
			if(count == matrixLength)
				return;
			if(x == xTop && y != yRight) {
				++y;
				list.add(matrix[x][y]);
			}
			if(y == yLeft) {
				if(x == xBottom)
					--xBottom;
				--x;
				list.add(matrix[x][y]);
			}
			else if(x == xBottom) {
				if(y == yRight)
					--yRight;
				--y;
				list.add(matrix[x][y]);
			}
			else if(y == yRight) {
				if(x == xTop)
					++xTop;
				++x;
				list.add(matrix[x][y]);
			}
		
		
	}
	
}
















