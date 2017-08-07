package com.technology.test;
/*
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 * 
 */
public class F_Missing_Number_268 {

	public static void main(String []args){
		
		int[] nums = {3,2,1};
		Solution_268 sl = new Solution_268();
		System.out.println(sl.missingNumber3(nums));
	}
}
class Solution_268 {
    public int missingNumber(int[] nums) {
        if(nums[0]==0)return 1;
        if(nums[0]==1)return 1;
        
    	for(int i=0;i<nums.length;i++){
    		if(i!=nums[i])return i;
    	}
    	return nums[nums.length-1]+1;
    }
    public int missingNumber2(int[] nums){
    	 int xor = 0, i = 0;
    		for (i = 0; i < nums.length; i++) {
    			xor = xor ^ i ^ nums[i];
    		}

    		return xor ^ i;
    }
    public int missingNumber3(int[] nums){
    	
    	int res = nums.length;
    	int sum = res*(res+1)/2;
    	for(int i=0;i<res;i++){
    		sum-=nums[i];
    	}
    	return sum;
    	
    	
    }
}
