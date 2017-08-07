package com.technology.test;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []temp={2,1,1,2,2,3,2,4,2};
		Solution_169 sl = new Solution_169();
		System.out.println(sl.majorityElement2(temp));
	}

}
class Solution_169{
    public int majorityElement(int[] nums) {
        int result=0;
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i=0;i<nums.length;i++){
    		if(map.containsKey(nums[i])){
    			
    			int temp  = map.get(nums[i])+1;
    			map.remove(nums[i]);
    			map.put(nums[i], temp);
    		}else{
    			map.put(nums[i], 1);
    		}
    	}
    	for(int i=0;i<nums.length;i++){
    		
    		if(map.get(nums[i])>nums.length/2){
    			
    			result = nums[i];
    			break;
    		}
    	}
    	return result;
    }
    
    public int majorityElement2(int[] nums) {
    	int major = nums[0]; int count = 1;
    	for(int i=1;i<nums.length;i++){
    		if(count==0){
    			major = nums[i];
    			count++;
    		}else if(major==nums[i]){
    			count++;
    		}else{
    			count--;
    		}
    	}
    	return major;
    	
    }
}