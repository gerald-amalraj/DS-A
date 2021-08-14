package com.java.leetcode.Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static boolean isContains(String toCheckInt, int startIndex, String[] subArry){
		for(int j=0;j<subArry.length;j++){
			if(subArry[j]!= null && subArry[j].equals(toCheckInt.trim()))
				return true;
		}
		return false;
	}
	
	public static int toFindLength(Object[] strArry){
		int count=0;
		for(int k=0;k<strArry.length;k++){
			if(strArry[k].equals("_"))
				return count;
			else
				++count;
		}
		return count;
	}

	public static void main(String[] args) {

		int[] nums = {1,1,2};
       
       String[] subArry = new String[nums.length];
       for(int i=0; i< nums.length;i++){
    	 
    	   if(subArry[0] == null){
    		   subArry[i]  = String.valueOf(nums[i]);
    		   continue;
    	   }
    	   if(isContains(String.valueOf(nums[i]), i, subArry))
    		   subArry[i]  = "_";
    	   else
    		   subArry[i]=String.valueOf(nums[i]);
    	  
       }
      int t = toFindLength(Arrays.stream(subArry).sorted().toArray());
       System.out.println(Arrays.toString(Arrays.stream(subArry).sorted().toArray()));
       System.out.println(t);
	}

}
