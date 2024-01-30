package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LetterAppearsPractise {
	public static void main(String[] args) {
		String[] strs = { "abc", "bcd", "cde" };
		getLettersAppears(strs);
	}

	private static void getLettersAppears(String[] words) {

		Map<Character, Set<Character>> res = new HashMap<>();

		Map<Character, Set<Integer>> charWithItsPositionIneachWord = new HashMap<Character, Set<Integer>>();
		for (String word : words) {
			for (int i = 0; i < word.toCharArray().length; i++) {
				charWithItsPositionIneachWord.putIfAbsent(word.charAt(i), new HashSet<Integer>());
				charWithItsPositionIneachWord.get(word.charAt(i)).add(i);
			}
		}

		// Get Chars Based on the max number..

		for (Character key : charWithItsPositionIneachWord.keySet()) {

			int max =0;
			Map<Character, Integer> countMap = new HashMap<Character, Integer>();
			for (int i = 0; i < charWithItsPositionIneachWord.get(key).size(); i++) {
			
				for (Character c : charWithItsPositionIneachWord.keySet()) {
					if(key == c) {
						continue;
					}  else {
						if()
					}

				}
			}

		}

	}

}
