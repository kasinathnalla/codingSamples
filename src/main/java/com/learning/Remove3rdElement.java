package com.learning;

import java.util.ArrayList;
import java.util.List;

public class Remove3rdElement {
	public static void main(String[] a) {
		
		List<Integer> circularList = new  ArrayList();
		for(int i=0; i<10;i++) {
			circularList.add(i);
		}

		int killPosition = 4;
		 int index = 0;

	        while (circularList.size() > 1) {
	            index = (index + (killPosition-1)) % circularList.size();  // Adjust index for circular iteration
	            int removedElement = circularList.remove(index);
	            System.out.println("Removed element: " + removedElement);
	            index %= circularList.size();  // Ensure the index is within the bounds of the updated list
	        }

	        System.out.println("Last remaining element: " + circularList.get(0));
	}

}
