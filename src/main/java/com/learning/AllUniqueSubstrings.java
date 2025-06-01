package com.learning;

import java.util.HashSet;
import java.util.Set;

public class AllUniqueSubstrings {

    public static Set<String> findAllUniqueSubstrings(String input) {
        Set<String> uniqueSubstrings = new HashSet();

        for (int tupleLength = 1; tupleLength <= input.length(); tupleLength++) {
            for (int i = 0; i <= input.length() - tupleLength; i++) {
                String substring = input.substring(i, i + tupleLength);
                uniqueSubstrings.add(substring);
            }
        }

        return uniqueSubstrings;
    }

    public static void main(String[] args) {
        String inputString = "sbc";
        
        Set<String> result = findAllUniqueSubstrings(inputString);

        System.out.println("All possible unique substrings: " + result);
    }
}

