package com;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleStrings {
	static List<String> s = new ArrayList<String>();
	public static void main(String[] a) {
		
		findSubsequence("sbc", "");
		System.out.println(s);
	}
	private static void findSubsequence(String actual, String ans) {
		
		if(actual.length()==0) {
			s.add(ans);
			return;
		}
		findSubsequence(actual.substring(1), ans);
		findSubsequence(actual.substring(1), ans+actual.charAt(0));
		
	}

}
