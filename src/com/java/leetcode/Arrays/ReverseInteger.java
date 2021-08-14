package com.java.leetcode.Arrays;

import java.util.Arrays;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = 964;
		
		if(x !=0 || x!=-0){
	    int[] digits = Integer.toString(x)
	    		       .chars()
	    		       .map(c -> c-'0')
	    		       .toArray();
	    int[] temp = new int[digits.length];
	    //System.out.println("temp Size: "+temp.length);
	    int j=0;
	    boolean b = false;
	    for(int i=digits.length-1;i>=0;i--){
	    	if(digits[i] < 0){
	    		b= true;
	    		continue;
	    	}
	    	 System.out.println("j Size: "+j);
	    	temp[j++] = digits[i];
	    }
	    String str="";
	   
	   int tempSize = temp.length;
	    if(b){
	           str = "-"+str;
	           tempSize = temp.length-1;
	    }
	    for(int i=0; i<tempSize;i++){
	    	str=str+temp[i];
	    }
	    System.out.println(Long.parseLong(str));
		}else{
			System.out.println(x);
		}
		
		 
	}

}
