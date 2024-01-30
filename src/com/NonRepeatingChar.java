package com;

public class NonRepeatingChar {

	public static boolean expandFromMiddle(String s, char check, int pos) {

		int apointer = 0;
		int lastPointer = s.length() - 1;
		while (apointer < lastPointer) {
			if (apointer == pos || lastPointer == pos) {
				apointer++;
				lastPointer--;
				continue;
			}
			if (s.charAt(apointer) == check || s.charAt(lastPointer) == check) {
				return true;
			} else {
				apointer++;
				lastPointer--;
			}
		}
		return false;

	}

	public static void check(String s) {

		for (int i = 0; i < s.length(); i++) {

			if (!expandFromMiddle(s, s.charAt(i), i)) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

	public static void main(String[] s) {
		check("apple");
		check("papaya");
	}

}
