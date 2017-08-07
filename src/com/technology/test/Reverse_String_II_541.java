package com.technology.test;

public class Reverse_String_II_541 {

	public static void main(String args[]){
		
		String s = "abcdefg";
		Solution_541 sl = new Solution_541();
		System.out.println(sl.reverseStr2(s, 2));
	}
}
class Solution_541{

//	better way
	public String reverseStr2(String s,int k){
		
		char []arr = s.toCharArray();
		int n = s.length();
		int i = 0;
		while(i<n){
			int j = Math.min(i+k-1, n-1);
			swap(arr,i,j);
			i+=2*k;
		}
		return new String(arr);
		
		
		
	}
	public void swap(char[] arr, int l,int r){
		
		while(l<r){
			char temp = arr[l];
			arr[l++]=arr[r];
			arr[r--]=temp;
		}
	}
	
	public String reverseStr(String s,int k){
		String []temp = new String[s.length()/k+1];

		for(int i=0;i<temp.length-1;i++){
			
			temp[i]=s.substring(i*k,(i+1)*k);
			
		}
		temp[temp.length-1]=s.substring((temp.length-1)*k);
		String result ="";
		for(int i=0;i<temp.length;i++){
			if(i%2==0){
				result+=reverse(temp[i]);
			}else{
				result+=temp[i];
			}
		}
//		result+=temp[temp.length-1];
		return result;
	
		
	}
	public String reverse(String s){
		
		char[] word = new char[s.length()];
		word = s.toCharArray();
		int i=0;
		int j=s.length()-1;
		while(i<j){
			char temp = word[i];
			word[i]=word[j];
			word[j]=temp;
			i++;
			j--;
		}
		return new String(word);
	}
}
