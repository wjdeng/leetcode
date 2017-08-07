package com.technology.test;

public class NO_Roman_to_Integer_Integer_to_Roman_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "DLXII";
		Solution_13 sl = new Solution_13();
		System.out.println(sl.romanToInt(s));
		int temp = 562;
		System.out.println(sl.IntToRoman(temp));
	}

}
class Solution_13{
	
	public int romanToInt(String s){
		
		int nums[] = new int[s.length()];
		
		for(int i=0;i<s.length();i++){
			
			switch(s.charAt(i)){
			
			case 'M':
				nums[i] = 1000;
				break;
			case 'D':
				nums[i] = 500;
				break;
			case 'C':
				nums[i] = 100;
				break;
			case 'L':
				nums[i] = 50;
				break;
			case 'X':
				nums[i] = 10;
				break;
			case 'V':
				nums[i] = 5;
				break;
			case 'I':
				nums[i] = 1;
				break;
			
			
			}
		}
		int sum = 0;
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]<nums[i+1]){
				sum-=nums[i];
			}else{
				sum+=nums[i];
			}
		}
		return sum+nums[nums.length-1];
	}
	
	public String IntToRoman(int aNumber){
		
		int []aArray = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String []rArray = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		String rNumber = "";
		for(int i=0;i<aArray.length;i++){
			while(aNumber>=aArray[i]){
				rNumber=rNumber+rArray[i];
				aNumber-=aArray[i];
			}
		}
		return rNumber;
	}
	
}
