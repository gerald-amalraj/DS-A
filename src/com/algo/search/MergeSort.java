package com.algo.search;

public class MergeSort {
	
	 
	 static void printArray(int[] printArray, String str) {
		 System.out.println(str);
		 for(int i=0; i<printArray.length; i++) 
			 System.out.print(printArray[i]+ " ");
	}
	 
	 static int[] merge_sort(int[] arr) {
		 if(arr.length<=1) {
			 return arr;
		 }
		 
		 int[] result = new int[arr.length];
		 
		 int midpoint = arr.length/2;
		 
		 int[] left  = new int[midpoint];
		 int[] right;
		 
		 if(arr.length%2 == 0) 
			 right = new int[midpoint];
		 else 
			 right = new int[midpoint+1];
		 
		 
		 for(int i=0;i<midpoint;i++)
			 left[i] = arr[i];
		 
		 int x=0;
		 for(int j=midpoint; j<arr.length;j++) {
			 right[x] = arr[j];
			 x++;
		 }
		 
		 left = merge_sort(left);
		 right = merge_sort(right);
		 printArray(left, "L:: ");
		 System.out.println();
		 printArray(right, "R:: ");
		result = merge(left,right);
		
		return result;
	 }
	 
	 
	static int[] merge(int[] left, int[] right) {
		 
		 int totalLengthResult = left.length + right.length;
		 int[] result = new int[totalLengthResult];
		 int indexL = 0;
		 int indexR = 0;
		 int indexRes = 0;
	
		 while(indexL < left.length || indexR < right.length) {
			 if(indexL < left.length && indexR < right.length) {
				 if(left[indexL] <= right[indexR]) {
					 result[indexRes] = left[indexL];
					 indexL++;
					 indexRes++;
				 }else {
					 result[indexRes] = right[indexR];
					 indexR++;
					 indexRes++;
				 }
			 }else if(indexL < left.length) {
				 result[indexRes] = left[indexL];
				 indexL++;
				 indexRes++;
			 }else if(indexR < right.length) {
				 result[indexRes] = right[indexR];
				 indexR++;
				 indexRes++;
			 }
		 }		 
		 return result;
	 }
	 
	 
	 
	    // Driver method to test above 
	    public static void main(String args[]) 
	    { 
	       // MergeSort ob = new MergeSort(); 
	         int arr[] = {6,3,1,4,8,2,5}; 
	        //int arr[] = new int[10]; 
	        
	       /* for (int i=0; i< arr.length;i++)
	        	arr[i] = (int)(Math.random()*10);*/
	        
	        int[] result = merge_sort(arr); 
	        System.out.println();
	        if (result.length == -1) 
	            System.out.println("Element not present"); 
	       // else
	          //  printArray(result);
	    } 
	

}
