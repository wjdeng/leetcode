package com.technology.test;

public class Ransom_Note_383 {

	public static void main(String args[]){
		
		 String ran = "aa";
		 String mag = "ab";
		 Solution_383 sl = new Solution_383();
		 
		 System.out.println(sl.canConstruct2(ran, mag));
	}
}

class Solution_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
    char []r = ransomNote.toCharArray();
    char []m = magazine.toCharArray();
    	int result = 0;
    	for(char i :r){
    		for(int j=0;j<m.length;j++){
    			
    			if(i == m[j]) 
    			{
    				m[j]=' ';
    				result++;
    				break;
    			}
    		}
    	}
    	
    	if(result==r.length) return true;
    	
    	return false;
    }
    public boolean canConstruct2(String ransomNote, String magazine) {
    	
    	int[] arr = new int[26];
    	for(int i=0;i<magazine.length();i++){
    		
    		arr[magazine.charAt(i)-'a']++;
    	}
    	for(int i=0;i<ransomNote.length();i++){
    		if(--arr[ransomNote.charAt(i)-'a']<0) return false;
    	}
    	return true;
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}