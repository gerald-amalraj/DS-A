package com.java.hackerEarth;

import java.util.Arrays;

public class CandyChildren {
	static int canCount =0;
	int totalChildren=0;
	static int[] candyCount;
	static int totalSumCount=0;
	
	public static void candyDistribut(int totalCandies, int totalChildren){
		candyCount = new int[totalChildren];
		
		while(totalSumCount<totalCandies){
			allocateCandies(totalCandies, totalChildren, candyCount);
		}
	}
	
	public static void allocateCandies(int totalCandies, int totalChildren, int[] arr){
		for(int i=0; i< totalChildren;i++){
			iterateAndSumArray();
			if(totalSumCount >= totalCandies)
				break;
			int candy;
			if(canCount >0){
				candy=canCount+1;
				arr[i]=arr[i]+candy;
				canCount=candy;
			}else{
				candy = i+1;
				arr[i]=arr[i]+candy;
				canCount=candy;
			}	
		}
	}
	
	public static void iterateAndSumArray(){
		int totalSum=0;
		for(int i=0;i<candyCount.length;i++){
		totalSum = totalSum + candyCount[i];
		}	
		totalSumCount = totalSum;
	}

	public static void main(String[] args) {
		new CandyChildren().candyDistribut(28, 3);
		System.out.println(Arrays.toString(candyCount));
	}
}
