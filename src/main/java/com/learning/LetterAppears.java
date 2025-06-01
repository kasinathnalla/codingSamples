package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LetterAppears {

	public static void main(String[] args) {

	
		String[] strs  = {"abc", "bcd", "cde"};
		System.out.println(getLettersAppears(strs));
}
	private static Map<Character, Set<Character>> getLettersAppears(String[] strs) {
		Map<Character, Set<Integer>> map = new HashMap<>();
		for(int i=0;i<strs.length;i++) {
			String s = strs[i];
			for(char c : s.toCharArray()) {
				map.putIfAbsent(c, new HashSet<>());
				
				System.out.println(""+c+"  "+i);
				map.get(c).add(i);
			}
		}

			
		
		Map<Character, Set<Character>> res = new HashMap<>();
		for(char key : map.keySet()) {
			
			//a ,0
			Map<Character, Integer> cntMap = new HashMap<>();
			int max = 0;
			for(Integer pos :  map.get(key)) {
				
				for(char k : map.keySet()) {
					if(key == k)
						continue;
					
					if(map.get(k).contains(pos)) {
						cntMap.put(k, cntMap.getOrDefault(k, 0) + 1);
						max = Math.max(max, cntMap.get(k));
					}
				}	
			}
			Set<Character> set = new HashSet<>();
			for(Map.Entry<Character, Integer> entry : cntMap.entrySet()) {
				if(entry.getValue() == max)
					set.add(entry.getKey());
			}
			res.put(key, set);
		}
		
		return res; 
	}
}
