package com.technology.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args){
		
		
		Result result = new Result();
		System.out.println("请输入一个整数：");
		int a = DataInput.getInt();
		result.print(a);
		StringBuffer sb = new StringBuffer();
		sb.append(a);
		sb.append("的平方等于：");
		sb.append(a*a);
		sb.append("\r\n");
		
		String s = sb.toString();
		DataOutput.outData(s);
	}
	
}

class Result{
	
	void print(int d){
		
		System.out.println(d+"的平方等于："+d*d);
		System.out.println(d+"的立方等于："+d*d*d);
	}
	
}

class DataInput{
	

	
	public static int getInt(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		return a;
	}
	

}

class DataOutput{
	
	public static void outData(String s){
		
		try {
			FileOutputStream out = new FileOutputStream("D://test.txt",true);
			out.write(s.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}