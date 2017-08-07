package com.technology.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DiGui1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = new String[]{
			"1","2","3","4"	
		};
		
		listAll(Arrays.asList(array), "");
	}
	
	public static void listAll(List candicate,String prefix){
		System.out.println(prefix);
	
		for(int i=0;i<candicate.size();i++){
			
			List temp = new LinkedList(candicate);
			listAll(temp, prefix+temp.remove(i));
		}
	
	}

}
