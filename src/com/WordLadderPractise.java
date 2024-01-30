package com;

import java.util.*;

public class WordLadderPractise {

	 public static List<String> findLadder(String beginWord, String endWord, List<String> wordList) {
	        List<String> ladder = new ArrayList<>();
	        Set<String> wordSet = new HashSet<>(wordList);
	        
	        if (!wordSet.contains(endWord)) {
	            // End word is not in the word list, no ladder possible
	            return ladder;
	        }
	        
	        Queue<List<String>> queue = new LinkedList<>();
	        queue.offer(Arrays.asList(beginWord));
	        
	        while (!queue.isEmpty()) {
	            int size = queue.size();
	            Set<String> visited = new HashSet<>();
	            System.out.println("ee");
	            for (int i = 0; i < size; i++) {
	                List<String> currentPath = queue.poll();
	                String currentWord = currentPath.get(currentPath.size() - 1);
	                
	                char[] wordArray = currentWord.toCharArray();
	                
	                for (int j = 0; j < wordArray.length; j++) {
	                    char originalChar = wordArray[j];
	                    for (char c = 'a'; c <= 'z'; c++) {
	                        wordArray[j] = c;
	                        String transformedWord = new String(wordArray);
	                        
	                        if (wordSet.contains(transformedWord) && !visited.contains(transformedWord)) {
	                            List<String> newPath = new ArrayList<>(currentPath);
	                            newPath.add(transformedWord);
	                            queue.offer(newPath);
	                            visited.add(transformedWord);
	                            
	                            if (transformedWord.equals(endWord)) {
	                                // Found a ladder
	                                return newPath;
	                            }
	                        }
	                    }
	                    wordArray[j] = originalChar;
	                }
	            }
	        }
	        
	        // No ladder found
	        return ladder;
	    }

	    public static void main(String[] args) {
	        String beginWord = "hit";
	        String endWord = "cog";
	        List<String> wordList = Arrays.asList("hot", "dat", "dag", "lat", "lag", "cog");

	        List<String> ladder = findLadder(beginWord, endWord, wordList);

	        if (ladder.isEmpty()) {
	            System.out.println("No ladder found.");
	        } else {
	            System.out.println("Word ladder: " + ladder);
	        }
	    }
}
