package com.peige.algo;

public class _13_RobotMove {
	
    public int movingCount(int threshold, int rows, int cols) {
    	if(rows <= 0 || cols <= 0 || threshold < 0)
    		return 0;
    	
    	boolean[][] visited = new boolean[rows][cols];
    	
    	return movingCount(threshold, rows, cols, 0, 0, visited);
    }
    
    private int movingCount(int threshold, int rows, int cols, int r, int c, boolean[][] visited) {
    	
    	if(r >= rows || r < 0 || c >= cols || c < 0)
    		return 0;
    	if(visited[r][c] || isBiggerThanThreshold(r, c, threshold))
    		return 0;

    	visited[r][c] = true;
    	
    	return 1 + movingCount(threshold, rows, cols, r + 1, c, visited) +
    			movingCount(threshold, rows, cols, r - 1, c, visited) +
    			movingCount(threshold, rows, cols, r, c + 1, visited) +
    			movingCount(threshold, rows, cols, r, c - 1, visited);
    }
    
    private boolean isBiggerThanThreshold(int r, int c, int threshold) {
    	int sum = 0;
    	while(r > 0) {
    		sum += r % 10;
    		r /= 10;
    	}
    	while(c > 0) {
    		sum += c % 10;
    		c /= 10;
    	}
    	return sum > threshold;
    }
}
