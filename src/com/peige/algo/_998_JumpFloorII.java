package com.peige.algo;

public class _998_JumpFloorII {
	
    public static int JumpFloorII(int target) {
    	if(target <= 0) 
    		return 0;
        int result = 1;
        for(int i = 0; i < target-1; ++i) {
        	result *= 2;
        }
        return result;
    }
    
}
