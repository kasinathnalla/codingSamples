package com.learning;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
	
		
		Set<Character> charSet = new HashSet<Character>();
		
		int a_pointer = 0;
		int b_pointer =0;
		int max = 0;
		while(b_pointer< s.length()) {
			if(!charSet.contains(s.charAt(b_pointer))) {
				charSet.add(s.charAt(b_pointer));
				b_pointer++;
				max = Math.max(charSet.size(), max);
				
			} else {
				charSet.remove(s.charAt(a_pointer));
				a_pointer++;
			}
		}
		return max;

	}

	public static void main(String[] a) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}

}
