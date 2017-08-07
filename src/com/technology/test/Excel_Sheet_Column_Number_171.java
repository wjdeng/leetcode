package com.technology.test;

public class Excel_Sheet_Column_Number_171 {

	public static void main(String args[]){
		
		String temp = "AA";
		Solution_171 sl = new Solution_171();
		System.out.println(sl.titleToNumber2(temp));
		
	}
}

class Solution_171 {
    public int titleToNumber(String s) {
        int result = 0;
    	for(int i=0;i<s.length();i++){
    		int beishu=1;
    		for(int j=0;j<i;j++){
    			beishu*=26;
    		}
    		result+=(s.charAt(s.length()-i-1)-'A'+1)*beishu;
    	}
    	return result;
    }
    
    public int titleToNumber2(String s) {
    	int result = 0;
    	for(int i=0;i<s.length();i++){
    		
    		result*=26;
    		result+=(s.charAt(i)-'A'+1);
    	}
    	return result;
    }
}