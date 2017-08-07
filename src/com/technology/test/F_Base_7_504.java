package com.technology.test;

public class F_Base_7_504 {

	public static void main(String[] args) {
		
		int n = -100;
		Solution_504 sl = new Solution_504();
		System.out.println(sl.convertToBase7_4(n));

	}

}
class Solution_504{
    
	
	// The right way
	
	public String convertToBase7_2(int num) {
		
		if(num<0){
			return "-"+convertToBase7_2(-num);
		}
		if(num<9) return String.valueOf(num);
		return convertToBase7_2(num/9)+num%9;
		
	}
	
	public String convertToBase7(int num) {
    	char []arry=new char[99999];
    	int i=0;
    	while(num!=0){
    		arry[i]= (char) (num%7);
    		i=i+1;
    		num = num/7;
    	}
    	String result =String.valueOf(arry);
    	return result;
    }
	
	//不用递归的做法
	public String convertToBase7_3(int num){
		
		if(num==0) return "0";
		StringBuilder sb = new StringBuilder();
		boolean negtive = false;
		if(num<0) negtive=true;
		while(num!=0){
			sb.append((Math.abs(num%7)));
			num = num/7;
		}
		if(negtive==true){
			sb.append("-");
		}
		return sb.reverse().toString();
		
		
		
	}
	
	public String convertToBase7_4(int num){
		if(num<0) return "-"+ convertToBase7_4(-num);
		
		if(num<7) return String.valueOf(num);
		return convertToBase7_4(num/7) + num%7;
	}
    
    
    
}