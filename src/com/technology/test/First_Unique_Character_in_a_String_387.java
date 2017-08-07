package com.technology.test;



public class First_Unique_Character_in_a_String_387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "loveleetcode";
		Solution_387 sl =new Solution_387();
		System.out.println(sl.firstUniqChar(s));
	}

}
class Solution_387 {
    public int firstUniqChar(String s) {
// my erro!!
    	
    	int []arr = new int[26];
    	for(int i=0;i<s.length();i++){
    		arr[s.charAt(i)-'a']++;
    	}
    	for(int i=0;i<s.length();i++){
    		if(arr[s.charAt(i)-'a']==1) return i;
    	}
    	return -1;

    
    	
    }
}
