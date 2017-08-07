package com.technology.test;

import java.util.HashMap;
import java.util.Map;

public class WeixinHongbao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []gifts = {1,2,3,2,2};
		int n = 5;
		Gift g = new Gift();
		System.out.println(g.getValue(gifts, n));
	}

}
class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
    	
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	int init = 1;
    	int chushu;
    	if(n%2==0){
    		chushu=n/2;
    	}else{
    		chushu=n/2+1;
    	}
    	for(int i=0;i<gifts.length;i++){
    		
    		if(map.containsKey(gifts[i])){
    			
    			int temp=map.get(gifts[i]);
    			temp=temp+1;
    			map.remove(gifts[i]);
    			map.put(gifts[i], temp);
    		}else{
    			map.put(gifts[i], init);
    		}
    	}
    	for(int i=0;i<gifts.length;i++){
    		
    		int sum = map.get(gifts[i]);
    		if(sum>=chushu){
    			return gifts[i];
    		}
    	}
    	return 0;
    }
}