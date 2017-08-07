package com.technology.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Intersection_of_Two_Arrays_349 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums1 = {2,1};
		int []nums2 = {1,1};
		Solution_349 sl = new Solution_349();
		int [] temp = sl.intersection2(nums1, nums2);
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}

}
class Solution_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        
    	if(nums1.length==0||nums2.length==0){
    		int []result = {};
    		return result;
    	}
    	
    	List<Integer> l1 = new ArrayList<Integer>();
    	List<Integer> l2 = new ArrayList<Integer>();
    	List<Integer> l3 = new ArrayList<Integer>();
    	List<Integer> l4 = new ArrayList<Integer>();
    	for(int i=0;i<nums1.length;i++){
    		
    		l1.add(nums1[i]);
    	}
    	for(int i=0;i<nums2.length;i++){
    		
    		l2.add(nums2[i]);
    	}
    	
    	for(int i=0;i<l1.size();i++){
    		
    		if(l2.contains(l1.get(i))){
    			l3.add(l1.get(i));
    		}
    	}
    	for(int i=0;i<l3.size();i++){
    		if(!l4.contains(l3.get(i))){
    			l4.add(l3.get(i));
    		}
    	}
    	
    	int []result = new int[l4.size()];
    	for(int i=0;i<l4.size();i++){
    		result[i]=l4.get(i);
    	}
    	return result;
    	
    }
    public int[] intersection2(int[] nums1, int[] nums2) {
    	
    	Set<Integer> set = new HashSet<Integer>();
    	Set<Integer> intersection = new HashSet<Integer>();
    	
    	for(int i=0;i<nums1.length;i++){
    		set.add(nums1[i]);
    	}
    	
    	for(int i=0;i<nums2.length;i++){
    		if(set.contains(nums2[i])){
    			intersection.add(nums2[i]);
    		}
    	}
    	
    	int []result = new int[intersection.size()];
    	
    		int i=0;
    		Iterator<Integer> it = intersection.iterator();
    		while(it.hasNext()){
    			result[i++]=it.next();
    		}
    	
    	
    	
    	
    	
    	return result;
    	
    	
    	
    	
    	
    	
    }
}
