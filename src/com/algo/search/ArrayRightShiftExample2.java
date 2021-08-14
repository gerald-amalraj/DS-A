package com.algo.search;

import java.util.Arrays;

public class ArrayRightShiftExample2 {

	static void  shiftRight(int[] arr, int shiftRotation) {
		for(int i=shiftRotation-1;i>=0;i--) {
			shiftElemToRight(arr);
		}
	}
	
	static void shiftElemToRight(int[] arr) {
		int temp = arr[arr.length-1];
		
		for(int i=arr.length-1; i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0] = temp;
		
		System.out.println("===> "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,6,1,2};
		shiftRight(arr, 2);

	}

}
