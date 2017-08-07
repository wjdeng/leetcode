package com.technology.test;

import java.util.Arrays;

public class Minimum_Moves_to_Equal_Array_Elements_453 {

	public static void main(String []args){
		int[] nums={1,3,5};
		Solution_453 sl = new Solution_453();
		System.out.println(sl.minMoves2(nums));
		
	}
}
class Solution_453 {
    public int minMoves(int[] nums) {
        // my answer is error.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    	Arrays.sort(nums);
    	int len = nums.length;
    	int result = 0; 
    	while(nums[0]!=nums[len-1]){
    		
    		
    		if(nums[len-2]<=nums[len-1]){
    			if(nums[len-2]==nums[0]&&nums[len-1]-nums[len-2]==1){
    				result++;
    				return result;
    			}
	    		int gap = nums[len-1]-nums[len-2]+1;
    			for(int i=0;i<len-1;i++){
	    			nums[i]+=gap;
	    				
	    		}
	    		result+=gap;
    			
    		}
    		if(nums[len-2]>nums[len-1]){
    			Arrays.sort(nums);
    		}
    	}
    	return result;
    }
    public int minMoves2(int[] nums) {
        if (nums.length == 0) return 0;
        int min = nums[0];
        for (int n : nums) min = Math.min(min, n);
        int res = 0;
        for (int n : nums) res += n - min;
        return res;
    }
}