package com.java.leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		int x = 0;

		//if (x != 0) {
			int[] digits = Integer.toString(x).chars().map(a -> a - '0').toArray();
			int[] temp = new int[digits.length];
			int j = 0;
			for (int i = digits.length - 1; i >= 0 ; i--) {
				System.out.println(digits[i]);
				if(digits[i] >= 0)
				 temp[j++] = digits[i];
			}
			
			String str="";
			for(int i=0; i<temp.length;i++){
		    	str=str+temp[i];
		    }
			
			System.out.println(str);
			boolean b = String.valueOf(x).equals(str)  ? true : false ;
			
			System.out.println(b);
		//}

	}

}
