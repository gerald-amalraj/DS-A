package com.algo.search;

import java.util.Arrays;

public class CStyleString {
	
	static void performCStyleStringMethod1(String str) {
		int a = 0;
		int b = str.length()-1;
		char[] arr = str.toCharArray();
		while(a < b) {
			char temp = arr[a];
			arr[a] = arr[b];
			arr[b]=temp;
			b--;
			a++;
		}
		
		System.out.println("===> "+new String(arr));		
	}
	
	static void performCStyleStringMethod2(String str) {
		char[] arr = str.toCharArray();
		char[] newarr = new char[arr.length];
		int j=0;
		for(int i= arr.length-1;i>=0;i--) {
			newarr[j]= arr[i];
			j++;
						
		}
		
		System.out.println(">>>>>> "+new String(newarr));		
	}
	

	public static void main(String[] args) {

		performCStyleStringMethod1("jerry");
		performCStyleStringMethod2("jerry");
		

	}

}
