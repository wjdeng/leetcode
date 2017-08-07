package com.technology.test;

import java.util.Stack;

/*
 * 题目意思：一个字符串有PLA三种字符，连续的L超过2次或者A超过1次，就是false，否则是true;
 * 解题思路：Map 
 * 
 * 
 */
public class Student_Attendance_Record_I_551 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "PPALLP";
		Solution_551 sl = new Solution_551();
		System.out.println(sl.checkRecord(s));
	}

}
class Solution_551{
    public boolean checkRecord(String s) {
    	if(s==null||s.length()==0)return false;
        int []temp = new int[3];
        Stack<Character> stack = new Stack<Character>();
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)=='P')temp[0]++;
    		if(s.charAt(i)=='L'){
    			temp[1]++;
    			if(temp[1]>2)return false;
    		}else{
    			temp[1]=0;
    		}
    		if(s.charAt(i)=='A')temp[2]++;
    	}
    	if(temp[2]>1)return false;
    	return true;
    }
}