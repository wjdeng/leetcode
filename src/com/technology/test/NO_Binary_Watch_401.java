package com.technology.test;

import java.util.ArrayList;
import java.util.List;

public class NO_Binary_Watch_401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution_401 {
    public List<String> readBinaryWatch(int num) {
       List<String> times = new ArrayList<String>(); 
       
       for(int hour=0;hour<12;hour++){
    	   for(int minu =0;minu<60;minu++){
    		   
    		   if(Integer.bitCount(hour*64+minu)==num){ //为什么是乘以64呢 ？ 因为 0000 | 000000  后面是6位
    			   times.add(String.format("%d:%02d", hour,minu));
    		   }
    	   }
       }
       return times;
    }
}