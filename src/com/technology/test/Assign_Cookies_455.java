package com.technology.test;

import java.util.Arrays;

public class Assign_Cookies_455 {

	public static void main(String []args){
		int []g={1,2};
		int []s={1,2,3};
		Solution_455 sl = new Solution_455();
//		System.out.println(sl.findContentChildren(g, s));
		System.out.println(sl.findContentChildren3(g, s));
		  
	}
}
class Solution_455 {
	
	public int findContentChildren3(int[]g , int[]s){
		
		Arrays.sort(g);
		Arrays.sort(s);
		
		int i = 0;
		
		for(int j=0; i<g.length && j<s.length;j++){
			if(g[i]<=s[j]){
				i++;
			}
		}
		
		return i;
	}
	
	
	
	
	
	
	
	
	
    public int findContentChildren(int[] g, int[] s) {
    	
//    	Input: [1,2], [1,2,3]
//
//    			Output: 2
//
//    			Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
//    			You have 3 cookies and their sizes are big enough to gratify all of the children, 
//    			You need to output 2.

    	Arrays.sort(g);
    	Arrays.sort(s);
    	int sum=0;
    	for(int i=0;i<g.length;i++){
    		
    		for(int j=0;j<s.length;j++){
    			if(g[i]<=s[j]){
    				sum++;
    				s[j]=-1;
    				break;
    			}
    		}
    	}
    	return sum;        
    } 
    public int findContentChildren2(int[] g,int[]s){
    	
    	Arrays.sort(g);
    	Arrays.sort(s);
    	int i=0;
    	for(int j=0;i<g.length&&j<s.length;j++){
    		if(g[i]<=s[j]) i++;
    	}
    	return i;
    }
}