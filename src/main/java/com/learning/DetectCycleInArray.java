package com.learning;

import java.util.ArrayList;
import java.util.List;

//TODO: Need to discuss
public class DetectCycleInArray {

	public static void main(String[] a) {

		int[] ar = { 1, 2};
		System.out.println(findCycle(ar));
	}

	private static int findCycle(int[] ar) {

		List<Integer> visited = new ArrayList<Integer>();
		boolean flag = false;
		int pos = 0;
		while (pos < ar.length) {
			if (pos == 0 && flag) {
				System.out.println("Break falg "+ flag);
				break;
			} else {
				visited.add(pos);
				pos = ar[pos];
				if (pos > ar.length || (visited.contains(pos) && pos != 0)) {
					System.out.println("falg -1 "+ flag);
					return -1;
				}
				flag = true;
				
			}
		}
		int cout = visited.size() - visited.indexOf(pos);
		System.out.println("falg "+ flag);
		return cout;
	}
}
