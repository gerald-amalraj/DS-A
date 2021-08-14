package com.java.leetcode.Arrays;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = new int[]{0,1,2,2,3,0,4,2};
		
		int removeEle = 2;
		
		for(int i=0;i<nums.length-1;i++){
			if(nums[i] == removeEle)
				nums[i] = nums[i+1];
		}
		System.out.println(Arrays.toString(nums));
	}

}
