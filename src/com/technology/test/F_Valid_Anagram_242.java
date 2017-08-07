package com.technology.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F_Valid_Anagram_242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a";
		String t = "a";
		Solution_242 sl = new Solution_242();
		sl.isAnagram2(s, t);
	}


}
class Solution_242{
	
	
	// The right answer.
	 public boolean isAnagram2(String s, String t) {
		 if(s.isEmpty()&&t.isEmpty())return true;
		 char []sarry = s.toCharArray();
		 char [] tarry = t.toCharArray();
		 Arrays.sort(sarry);
		 Arrays.sort(tarry);
		 if(Arrays.equals(sarry, tarry)){
			 return true;
		 }
		 return false;
		 
	 }
	 public boolean isAnagram3(String s,String t){
		 
		 if(s.isEmpty()&&t.isEmpty()) return true;
		 int []arr = new int[26];
		 for(int i=0;i<s.length();i++){
			 arr[s.charAt(i)-'a']++;
		 }
		 for(int i=0;i<t.length();i++){
			 arr[s.charAt(i)-'a']--;
		 }
		 for(int i=0;i<26;i++){
			 if(arr[i]>0){
				 return false;
			 }
		 }
		 return true;
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	List<Character> l = new ArrayList<Character>();
    public boolean isAnagram(String s, String t) {
        int sum=0;
        for(int i=0;i<t.length();i++){
        	l.add(t.charAt(i));
        }
        for(int i=0;i<s.length();i++){
        	if(l.contains(s.charAt(i))){
        		sum++;
        		remove(s.charAt(i));
        	}
        }
        
        if(sum==s.length()){
        	return true;
        }
        return false;
        
    }
    public void remove(char c){
    	 for(int i=0;i<l.size();i++){
         	if(l.get(i).equals(c)){
         		l.remove(i);
         	}
         	break;
         }
    }
}