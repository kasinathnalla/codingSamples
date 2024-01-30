package com;

public class BasePowerCalculation {

	public static Double calDouble(int base, int power) {
		boolean isNegative = false;
		if (power < 0) {
			isNegative = true;
			power = power * -1;

		}

		int re = 1;
		for (int i = 1; i <= power; i++) {
			re = re * base;

		}
		if(isNegative) {
			
			 return Double.valueOf(1) / re;
		}
		return Double.valueOf(re);
	}

	public static void main(String[] a) {
		System.out.println(calDouble(2, 0));
		System.out.println(calDouble(0, 5));
		System.out.println(calDouble(2, -2));
		
		System.out.println(calDouble(2, -3));
		System.out.println(calDouble(2, -4));
		System.out.println(calDouble(2, 5));
		System.out.println(calDouble(2, 6));
		System.out.println(calDouble(2, 7));

	}
}
