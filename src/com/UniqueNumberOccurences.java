package com;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOccurences {
    public static boolean uniqueOccurrences(int[] arr) {

    	boolean uniqueOccurences =false;
        Map<Integer, Integer> numberOfOccurencesForeachDigit = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++ ) {
        	
        	numberOfOccurencesForeachDigit.put(arr[i], numberOfOccurencesForeachDigit.getOrDefault(arr[i], 0)+1);
        }
        
        for(Integer val: numberOfOccurencesForeachDigit.values()) {
        	if(val>1) {
        		uniqueOccurences=true;
        	}
        }
        return uniqueOccurences;

    }
    public static void main(String[] a) {
    	System.out.println(uniqueOccurrences(new int[] {1,2,2,1,1,3}));
    }

}
