package com.technology.test;


import java.util.Stack;

/*
 * 题目意思：给了两个代表着整数的字符串，且第一个字符都不为0，不能直接转换为整数，求和。
 * 解题思路： 通过Ascii码得到整数，求和
 * 启示：没有看清题意，题目中有一个条件就是，这两个字符串的长度为5100以下，根本没有这么大的数据类型表示，而且又
 * 不能用BigInteger 来表示大数据，那怎么办？
 * 正确解题思路：用StringBuilder ，从两个字符串的最后一位，通过-'0'得到最后一位的值，相加再加进位值模10得到最后一位，
 * 并计算新的进位值，参与下一位的计算。最后得到的sb反转在转化为String 即可
 * 
 */
public class F_Add_String_415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution_415 sl = new Solution_415();
		System.out.println(sl.addStrings2("0", "0"));

		
	}

}


class Solution_415{
	
	
	public String addStrings3(String num1,String num2){
		
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		for(int i=num1.length()-1,j = num2.length()-1;i>=0||j>=0||carry==1;i--,j--){
			int x = i<0 ? 0 : num1.charAt(i)-'0';
			int y = j<0 ? 0 : num2.charAt(j)-'0';
			sb.append((x+y+carry)%10);
			carry = (x+y+carry)/10;
		}
		return sb.reverse().toString();
		
	}
	

	public String addStrings2(String num1,String num2){
		
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		for(int i=num1.length()-1,j=num2.length()-1;i>=0 || j>=0 || carry==1;i--,j--){
			
			int x = i < 0 ? 0 : num1.charAt(i)-'0';
			int y = j < 0 ? 0 : num2.charAt(j)-'0';
			sb.append((x+y+carry)%10);
			carry = (x+y+carry)/10;
		}
		return sb.reverse().toString();
		
	}
    public String addStrings(String num1, String num2) {
        long sum = converInteger(num1)+converInteger(num2);
        System.out.println(sum);
    	String result = "";
    	return String.valueOf(sum);
    }
    public long converInteger(String num){
    	long result = 0;
    	for(int i=0;i<num.length();i++){
    		result = result*10 + (num.charAt(i)-'0');
    	}
    	return result;
    }
//    public String converString(int num){
//    	Stack<Character> stack = new Stack<Character>();
//    	while(num!=0){
//    		
//    		stack.push((num%10));
//    	}
//    }
}