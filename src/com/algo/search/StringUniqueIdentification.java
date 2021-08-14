package com.algo.search;

public class StringUniqueIdentification {

	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println("==> " + val);
			System.out.println(">>>>");
			if (char_set[val]) {
				System.out.println(">>>>====");
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	public static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); ++i) {
			System.out.println("=== " + str.charAt(i));
			int val = str.charAt(i) - 'a';
			System.out.println("===> " + val);
			System.out.println("@@@@@ " + (1 << val));
			System.out.println(checker + " ######## " + (checker & (1 << val)));
			if ((checker & (1 << val)) > 0) {

				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

	
	public static void main(String[] args) {
		// isUniqueChars2("jerry");
		isUniqueChars("jerry");
	}

}
