package com.java.hackerEarth;

import java.util.Scanner;

public class SumArrays {

	public static void main(String[] args) {
		//1000000001 1000000002 1000000003 1000000004 1000000005
	
		
		int[] arrayInts = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
		long k =0;
		//for(int i=0; i<arrayInts.length;i++){
			// k = k +arrayInts[i]; 
		//}
		// System.out.println("K :: "+ k);
		 
		 for(int arry : arrayInts)
			 k = k +arry;
		 
		 System.out.println("K :: "+ k);
	}

}
