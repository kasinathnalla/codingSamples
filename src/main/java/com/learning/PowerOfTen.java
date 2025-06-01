package com.learning;

public class PowerOfTen {
	public static void main(String[] s) {
		System.out.println(""+getPowerOfTen(10000));
		System.out.println(""+getPowerOfTen(10100));
		System.out.println(""+getPowerOfTen(11000));
	}

	private static boolean getPowerOfTen(int i) {

		boolean outcome = false;
		if(i==1) {
			return true;
		}
		else if(i%10<10 && i%10>0) {
			return false;
		}
		
		return getPowerOfTen(i/10);
	}

}
