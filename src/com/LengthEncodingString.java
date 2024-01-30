package com;

import java.util.ArrayList;
import java.util.List;

public class LengthEncodingString {
	public static void main(String[] a) {
		System.out.println("" + getLongestString("qqqqssddd"));

	}

	public static int getLongestString(String a) {

		List<Character> chars = new ArrayList<Character>();
		int max = 0;
		String responseStrig = "";
		char[] ip = a.toCharArray();
		for (int i = 0; i < ip.length; i++) {

			System.out.println("i " + i + " " + ip[i]);

			if (chars.isEmpty()) {
				chars.add(ip[i]);
				continue;
			}
			if (chars.contains(ip[i])) {
				chars.add(ip[i]);
			} else {
				int size = chars.size();
				max = Math.max(max, chars.size());
				char c = chars.get(0);
				chars.clear();
				chars.add(ip[i]);
				responseStrig = responseStrig + c + "" + size;

			}

		}
		responseStrig = responseStrig + chars.get(0) + "" + chars.size();
		System.out.println(responseStrig);
		max = Math.max(max, chars.size());
		return max;
	}
}
