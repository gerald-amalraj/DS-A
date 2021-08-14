package com.java.leetcode.Arrays;

import java.util.Arrays;

public class RemoveDupe {

	public static void main(String[] args) {
		int[] nums = { 0,0,1,1,1,2,2,3,3,4 };
		int n= nums.length;
		
		
		int[] temp = new int[nums.length];

		int j = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1])
				temp[j++] = nums[i];
		}
		temp[j++] = nums[nums.length - 1];
		System.out.println("Temp: " + Arrays.toString(temp));
		System.out.println("Nums: " + Arrays.toString(temp));
		for (int i = 0; i < j; i++) {
			nums[i] = temp[i];
		}
		System.out.println("Nums= " + Arrays.toString(temp));
		System.out.println("Count: "+j);
	}

}
