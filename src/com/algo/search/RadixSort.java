package com.algo.search;

import java.util.Arrays;

public class RadixSort {

	static int getMax(int arr[], int n) {
		int mx = arr[0];
		for (int i = 1; i < n; i++) 
			if (arr[i] > mx)
				mx = arr[i];
			
		return mx;
	}
	
	 static void countSort(int arr[], int n, int exp) 
	    { 
	        int output[] = new int[n]; // output array 
	        int i; 
	        int count[] = new int[10]; 
	        Arrays.fill(count,0); 
	        
	       
	        // Store count of occurrences in count[] 
	        System.out.println("Exp:: "+exp);
	        for (i = 0; i < n; i++) {
	        	
	            count[ (arr[i]/exp)%10 ]++; 
	        }
	        
	        print(count, count.length);
	       System.out.println();
	        // Change count[i] so that count[i] now contains 
	        // actual position of this digit in output[] 
	        for (i = 1; i < 10; i++) {
	            count[i] += count[i - 1]; 
	            System.out.println("Count["+i+"] :: "+count[i]);
	        }
	        // Build the output array 
	        for (i = n - 1; i >= 0; i--)  { 
	        	System.out.println("N:: "+n+" i:: "+i+" ======> "+count[ (arr[i]/exp)%10]+"  ###### "+arr[i]);
	        	
	            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
	            System.out.println("***** "+ count[ (arr[i]/exp)%10 ]--); 
	        } 
	        System.out.println();
	        print(output, n);
	        System.out.println();
	        System.out.println();
	        // Copy the output array to arr[], so that arr[] now 
	        // contains sorted numbers according to curent digit 
	        for (i = 0; i < n; i++) 
	            arr[i] = output[i]; 
	        	        
	    	print(arr, n);
	    } 
	 
	 	
	  
	    // The main function to that sorts arr[] of size n using 
	    // Radix Sort 
	    static void radixsort(int arr[], int n) 
	    { 
	        // Find the maximum number to know number of digits 
	        int m = getMax(arr, n); 
	  
	        // Do counting sort for every digit. Note that instead 
	        // of passing digit number, exp is passed. exp is 10^i 
	        // where i is current digit number 
	        for (int exp = 1; m/exp > 0; exp *= 10) 
	            countSort(arr, n, exp); 
	    } 

	static void print(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		int arr[] = { 170, 45, 75};
		int n = arr.length;
		radixsort(arr, n);
		
		//print(arr, n);

	}

}
