package com.peige.algo;

public class _999_JumpFloor {
	
    public static int JumpFloor(int target) {
    	if(target <= 0) 
    		return 0;
    	if(target <= 2)
    		return target;
    	
    	int min = 1;
    	int max = 2;
    	int fib = 0;
    	
    	for(int i = 3; i <= target; ++i) {
    		fib = min + max;
    		min = max;
    		max = fib;
    	}
    	
    	return fib;
    }
    
}
