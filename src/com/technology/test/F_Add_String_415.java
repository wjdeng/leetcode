package com.technology.test;


import java.util.Stack;

/*
 * ��Ŀ��˼�����������������������ַ������ҵ�һ���ַ�����Ϊ0������ֱ��ת��Ϊ��������͡�
 * ����˼·�� ͨ��Ascii��õ����������
 * ��ʾ��û�п������⣬��Ŀ����һ���������ǣ��������ַ����ĳ���Ϊ5100���£�����û����ô����������ͱ�ʾ��������
 * ������BigInteger ����ʾ�����ݣ�����ô�죿
 * ��ȷ����˼·����StringBuilder ���������ַ��������һλ��ͨ��-'0'�õ����һλ��ֵ������ټӽ�λֵģ10�õ����һλ��
 * �������µĽ�λֵ��������һλ�ļ��㡣���õ���sb��ת��ת��ΪString ����
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