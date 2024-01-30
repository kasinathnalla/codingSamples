package com;

import java.util.ArrayList;
import java.util.List;

public class LongestNonUniqueString {
	public static void main(String[] a) {
		System.out.println(""+getLongestString("qqqqssddd"));
		
	}
	public static int getLongestString(String a) {
	
		List<Character> chars = new ArrayList<Character>();
		int max =0;
		char[] ip = a.toCharArray();
		for(int i=0; i< ip.length;i++) {
			
			System.out.println("i "+i+" "+ip[i]);
			
			if(chars.isEmpty()) {
				chars.add(ip[i]);
				continue;
			}
			if(chars.contains(ip[i])) {
				chars.add(ip[i]);
			} else {
				max = Math.max(max, chars.size());
				chars.clear();
				chars.add(ip[i]);
			
			}
			
		}
		max = Math.max(max, chars.size());
		return max;
	}

}
