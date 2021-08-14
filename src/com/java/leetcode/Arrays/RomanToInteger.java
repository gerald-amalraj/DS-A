package com.java.leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static int getRomanValue() {

		return 0;
	}

	public static void main(String[] args) {
		Map<Character,Integer> roman = new HashMap<Character, Integer>();

		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		
		String romanStr = "III";
		
		char[] romanChrAry= romanStr.toCharArray();
		int total=0;
		for (int i = 0; i <= romanChrAry.length - 1; i++) {
			int current = roman.get(romanChrAry[i]);
			int next = 0;
			if ((i + 1) <= romanChrAry.length-1){
				next = roman.get(romanChrAry[i + 1]);
			if (current < next){
				total = total + (next - current);
				i++;
			}else
				total = total + current;
			}else
					total = total + current;
		}
		System.out.println("::: "+total);
		
	}

}
