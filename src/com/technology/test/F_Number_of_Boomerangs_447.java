package com.technology.test;

import java.util.HashMap;
import java.util.Map;

public class F_Number_of_Boomerangs_447 {

	public static void main(String []args){
		
		int[][]point = {{1,0},{2,0},{0,0}};
		Solution_447 sl = new Solution_447();
		
		System.out.println(sl.numberOfBoomerangs(point));
		
	}
}
class Solution_447{
	
	public int numberOfBoomerangs(int[][] points){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int sum=0;
		for(int i=0;i<points.length;i++){
			
			for(int j=0;j<points.length;j++){
				if(i==j)continue;
				int d = getDistance(points[i],points[j]);
				map.put(d, map.getOrDefault(d, 0)+1);
			}
			
			for(int a : map.values()){
				
					sum+=a*(a-1);
				
			}
			map.clear();
		}
		return sum;

	}
	public int getDistance(int[] a,int[]b){
		
		int dx = a[0]-b[0];
		int dy = a[1]-b[1];
		return dx*dx+dy*dy;
	}
}
