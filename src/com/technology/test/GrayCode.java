package com.technology.test;

public class GrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution_GrayCode sl = new Solution_GrayCode();
		String []result = sl.getGrayCode(4);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}

class Solution_GrayCode{
	
	public String[] getGrayCode(int n){
		
		int size = 1<<n;
		String []arry = new String[size];
		
		if(n==1){
			
			arry[0]="0";
			arry[1]="1";
			
		}else{
			
			String []arry2 = getGrayCode(n-1);
			for(int i=0;i<arry2.length;i++){
				
				arry[i]="0"+arry2[i];
				arry[arry.length-i-1]="1"+arry2[i];
			}
		}
		return arry;
		
		
		
		
	}
	
	
}
