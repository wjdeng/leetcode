package com.technology.test;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] temp = {1,2,3,4,5,4,5,2};
		Solution_217 s = new Solution_217();
		System.out.println(s.containsDuplicate(temp));
	}

}
class Solution_217{
    public boolean containsDuplicate(int[] nums) {
        
    	Set<Integer> set = new HashSet<Integer>();
    	for(int i=0;i<nums.length;i++){
    		if(set.contains(nums[i])){
    			set.add(nums[i]);
    		}else{
    			return true;
    		}
    	}
    	return false;
    }
}