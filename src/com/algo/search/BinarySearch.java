package com.algo.search;

public class BinarySearch {

	static int binarySearch(int[] arr, int searchNum, int startIndex, int endIndex) {
		int midpointIndex = startIndex + (endIndex - startIndex)/ 2;
		if (arr[midpointIndex] == searchNum) {
			return midpointIndex;
		}else if (arr[midpointIndex] > searchNum) {			
			return binarySearch(arr, searchNum, startIndex, midpointIndex-1);
		} else if (arr[midpointIndex] < searchNum) {			
			return binarySearch(arr, searchNum, midpointIndex+1, endIndex);
		}
		
		return -1;
	}

	static void printArray(int[] printArray) {
		 for(int i=0; i<printArray.length; i++) 
			 System.out.print(printArray[i]+ " ");
	}

	public static void main(String args[]) {

		int arr[] = { 2, 3, 4, 10, 40 };

		int result = binarySearch(arr, 10, 0, arr.length-1);

		System.out.println("Element is at " + result);

	}

}
