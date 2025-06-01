package com.learning;

import java.util.*;

public class WordLadder {


    public static void main(String[] args) {
        String start = "hit";
        String end = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        List<String> ladder = findWordLadder(start, end, wordList);
        System.out.println(ladder);
    }


    
   
    
    private static List<String> findWordLadder(String start, String end, List<String> wordList) {
        Queue<String> queue = new LinkedList<String>();
        Set<String> visited = new HashSet<String>();
       
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String currentWord = queue.poll();

            if (currentWord.equals(end)) {
                List<String> ladder = new ArrayList<>();
                ladder.add(currentWord);

                while (!queue.isEmpty()) {
                    String previousWord = queue.poll();
                    ladder.add(previousWord);
                }

                Collections.reverse(ladder);
                return ladder;
            }

            for (String neighbor : getNeighbors(currentWord, wordList)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return new ArrayList<>();
    }

 
        
    
    private static List<String> getNeighbors(String word, List<String> wordList) {
        List<String> neighbors = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String neighbor = word.substring(0, i) + c + word.substring(i + 1);

                if (wordList.contains(neighbor) && !neighbor.equals(word)) {
                    neighbors.add(neighbor);
                }
            }
        }

        return neighbors;
    }
}
