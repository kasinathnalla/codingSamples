package com.learning;

public class ReverseAString {
	private static String reverseString(String s) {

		int startPointer = 0;
		int lastPointer = s.length() - 1;

		char[] sArray = s.toCharArray();

		while (startPointer < lastPointer) {
			char a = sArray[startPointer];
			char b = sArray[lastPointer];

			sArray[startPointer] = b;
			sArray[lastPointer] = a;
			startPointer++;
			lastPointer--;
		}
		return new String(sArray);

	}
	public static void main(String[] a) {
		System.out.println(reverseString("kasi"));
		System.out.println(reverseString("Nalla"));
	}

}
