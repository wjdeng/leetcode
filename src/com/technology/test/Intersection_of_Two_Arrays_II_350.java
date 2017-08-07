package com.technology.test;

import java.util.ArrayList;
import java.util.List;

public class Intersection_of_Two_Arrays_II_350 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1={1,2,2,3,3,1};
		int[] nums2={2,2,3,3,1};
		Solution_350 sl = new Solution_350();
		int []result = sl.intersect(nums1, nums2);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}
class Solution_350{
	List<Integer> l1 = new ArrayList<Integer>();
	List<Integer> l2 = new ArrayList<Integer>();
	public int[] intersect(int[] nums1, int[]nums2){
		

		for(int i=0;i<nums1.length;i++){
			l1.add(nums1[i]);
		}
		for(int i=0;i<nums2.length;i++){
			if(l1.contains(nums2[i])){
				l2.add(nums2[i]);
				remove(nums2[i]);
			}
		}
		int []result = new int[l2.size()];
		for(int i=0;i<l2.size();i++){
			result[i]=l2.get(i);
		}
		return result;
		
		
	}
	public void remove(int x){
		for(int i=0;i<l1.size();i++){
			if(l1.get(i)==x) {
				l1.remove(i);
				break;
				
			}
		}
	}
	
}
