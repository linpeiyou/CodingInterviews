package com.peige.algo;

public class _12_StringPathInMatrix {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
    	if(matrix == null || str == null || matrix.length == 0 || str.length == 0) 
    		return false;
    	
    	int len = matrix.length;
    	boolean[] flags = new boolean[len];
    	
    	for(int r = 0; r < rows; ++r) {
    		for(int c = 0; c < cols; ++c) {
    			if(matrix[r * cols + c] == str[0]) {
    				if(hasPath(matrix, rows, cols, r, c, str, 0, flags)) {
    					return true;
    				}
    			}
    		}
    	}
    	return false;
    }
	
    private boolean hasPath(char[] matrix, int rows, int cols, int r, int c,
    		char[] str, int index, boolean[] flags) {
    	if(index == str.length)
    		return true;
    	if(r >= rows || r < 0 || c >= cols || c < 0)
    		return false;
    	if(flags[r * cols + c] == true || matrix[r * cols + c] != str[index])
    		return false;
    	
    	flags[r * cols + c] = true;
    	
    	boolean hp = hasPath(matrix, rows, cols, r + 1, c, str, index + 1, flags) ||
    			hasPath(matrix, rows, cols, r - 1, c, str, index + 1, flags) ||
    			hasPath(matrix, rows, cols, r, c + 1, str, index + 1, flags) ||
    			hasPath(matrix, rows, cols, r, c - 1, str, index + 1, flags);

    	if(hp == true)
    		return true;
    	
    	flags[r * cols + c] = false;
    	
    	return false;
    }
}















