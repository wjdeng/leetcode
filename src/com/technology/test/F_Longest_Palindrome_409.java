package com.technology.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class F_Longest_Palindrome_409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String temp = "abccccdd";
		Solution_409 sl = new Solution_409();
		System.out.println(sl.longestPalindrome2(temp));
	}

}
class Solution_409{
	
	//The right answer.
	public int longestPalindrome2(String s) {
		
		Set<Character> set = new HashSet<Character>();
		int count = 0;
		for(int i=0;i<s.length();i++){
			
			if(set.contains(s.charAt(i))){
				set.remove(s.charAt(i));
				count++;
			}else{
				set.add(s.charAt(i));
			}
		}
		if(set.isEmpty()){
			count=count*2;
		}else{
			count=count*2+1;
		}
		return count;
	}
		
	
	
	
    public int longestPalindrome(String s) {
		
    	Map<Character,Integer> map = new HashMap<Character,Integer>();
    	for(int i=0;i<s.length();i++){
    		if(map.containsKey(s.charAt(i))){
    			int temp = map.get(s.charAt(i))+1;
    			map.put(s.charAt(i), temp);
    		}else{
    			map.put(s.charAt(i), 1);
    		}
    	}
    	int result = 0;
    	int max = 0;
    	for(int i=0;i<s.length();i++){
    		if(map.get(s.charAt(i))%2==0){
    			result+=map.get(s.charAt(i));
    			map.put(s.charAt(i), 0);
    		}else{
    			max = Math.max(max, map.get(s.charAt(i)));
    		}
    	}
    	result+=max;
    	
    	return result;
        
    }
}