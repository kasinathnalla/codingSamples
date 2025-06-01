package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Anagram {
	
	public static void main(String[] a) {
		
		System.out.println(findAnagram(List.of("ot", "cat","dog","god","cat", "tom")));
	}
	
	private static List<List<String>> findAnagram(List<String> a){
		
		Map<String, List<String>> sortedKeyWithAnagrams = new HashMap<>();
		for(String s : a) {
			char[] ar = s.toCharArray();
			Arrays.sort(ar);
			String sp = String.valueOf(ar);
			List<String> values  = sortedKeyWithAnagrams.getOrDefault(sp, new LinkedList<String>());
			values.add(s);
			sortedKeyWithAnagrams.put(sp,  values);
		}
		List<List<String>> res = new ArrayList<List<String>>();
		for(Map.Entry<String, List<String>> e: sortedKeyWithAnagrams.entrySet()) {
			
			if(e.getValue().size()>1) {
				res.add(e.getValue());
			}
		}
		return res;
		
	}

}
