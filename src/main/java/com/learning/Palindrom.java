package com.learning;

public class Palindrom {

	/*
	 * public static int expandFromMiddle(String s, int left, int right) {
	 * while((left<right) && left>0 && right<s.length()) { if(s.charAt(left)!=
	 * s.charAt(right) ) { return right-left; } left--; right ++; }
	 * 
	 * }
	 * 
	 * 
	 * public static String longestPalindrom(String s) { int maxLen = 0;
	 * 
	 * for(int i=0; i<s.length();i++) {
	 * 
	 * int len1 = expandFromMiddle(s, i, i); int len2 = expandFromMiddle(s, i, i+1);
	 * int len = Math.max(len1, len2); maxLen = Math.max(maxLen, len);
	 * 
	 * 
	 * } }
	 */
	public static String longestPalindrom(String s) {
		if (s == null || s.length() < 1)
			return "";
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandFromMiddle(s, i, i);
			int len2 = expandFromMiddle(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > (end - start)) {
				start = i - ((len - 1) / 2);
				end = i + ((len - 1) / 2);
			}
		}

		return s.substring(start, end + 1);
	}

	public static int expandFromMiddle(String s, int left, int right) {
		if (s == null || left > right) {
			return 0;
		}
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;

		}
		return right - left - 1;
	}

	public static void main(String[] s) {
		System.out.println("" + longestPalindrom("aba123"));
	}
}
