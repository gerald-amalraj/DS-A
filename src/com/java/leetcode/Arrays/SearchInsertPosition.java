package com.java.leetcode.Arrays;

public class SearchInsertPosition {
	

	public static void main(String[] args) {
	  int[] nums = {1,3,5,6};
	  //int target = 5; // 0: 2
	  //int target = 2; // 0: 1
	  int target = 7; // 0: 4
	  //int target = 0; // 0:0
	  //int[] nums = {1};
	  //int target = 0; // 0:
	    int srchIndex=0;
	  
	  for(int i=0;i<=nums.length-1;i++){
		  if(nums[i]==target || nums[i] > target){
			  srchIndex = i;
			  break;
		  }else if(i == nums.length-1 && nums[i] < target){
 			  srchIndex = i+1;
 			  break;
		  }	  
	  }
	}

}
