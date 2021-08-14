package com.java.leetcode.Arrays;

import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		//String[] words = new String[] {"dog","racecar","car"};
		//String[] words = new String[] {"flower","flow","flight"};
		//String[] words = new String[] {"flower","flower","flower","flower"};
		//String[] words = new String[] {"a"};
		//String[] words = new String[] {"cir","car"};
		//String[] words = new String[] {"aaa","aa","aaa"};
		//String[] words = new String[] {"abab","aba",""};
		//String[] words = new String[] {"c","acc","ccc"};
		//String[] words = new String[] {"c","c"};     // "c"
		String[] words = new String[] {"ac","ac","a","a"};
		System.out.println(words.length);
		String str = "";
		if(words.length>1){
			
		char[] word = words[0].toCharArray();
		System.out.println("---> "+word.length);
		for (int j = 0; j <= word.length - 1; j++) {
			System.out.println("@@@@: "+j+" ==== "+word[j]);
			boolean isSame = false;
			for (int k = 0; k <words.length - 1; k++) {
				System.out.println("%%%%: "+words[k + 1]);
				
				char[] wordX = words[k + 1].toCharArray();
				if (j <= wordX.length - 1) {
					
					if (word[j] == wordX[j])
						isSame = true;
					else{
						isSame = false;
						break;
					}
				}else{
					isSame = false;
					break;
				}
			}
			if (isSame)
				str = str + word[j];
			else
				break;
		}
		System.out.println("&&&& " + str);
	}else
		System.out.println("&-&-&-& " + words[words.length-1]);
	}
}
