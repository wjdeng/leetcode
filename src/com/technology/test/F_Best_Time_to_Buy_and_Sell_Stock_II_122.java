package com.technology.test;

import java.util.ArrayList;
import java.util.List;

public class F_Best_Time_to_Buy_and_Sell_Stock_II_122 {

	public static void main(String []args){
		
		int [] prices={5,4,6,2,1,3,5,2};
		Solution_122 sl = new Solution_122();
		System.out.println(sl.maxProfit(prices));
		
	}
}















class Solution_122 {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
        	return 0;
        }
    	List<Integer> l = new ArrayList<Integer>();
    	for(int i=1;i<prices.length-1;i++){
    		
    		if((prices[i]>prices[i-1]&&prices[i]>prices[i+1])||(prices[i]<prices[i-1]&&prices[i]<prices[i+1])){
    			
    			l.add(prices[i]);
    		}
    	}
    	int result = 0;
    	for(int i=0;i<l.size()-1;i++){
	    	if(l.get(i)<l.get(i+1)){
	    		
	    		result+=(l.get(i+1)-l.get(i));
	    	}
    	}
    	if(prices[0]<l.get(0)){
    		result+=(l.get(0)-prices[0]);
    	}
    	return result;
    }
    
    public int maxProfit2(int[] prices) {
    	int result = 0;
    	for(int i=1;i<prices.length;i++){
    		int gap = prices[i]-prices[i-1];
    		if(gap>0){
    			result+=gap;
    		}
    	}
    	return result;
    }
}