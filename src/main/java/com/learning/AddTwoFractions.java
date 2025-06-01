package com.learning;

public class AddTwoFractions {
	
	public static void main(String[] a) {
		int[] first = {1,2};
		int[] second = {3,4};
		
		
		String val  = addTwoFractions(first, second);
		System.out.println(val);
	}

	private static String addTwoFractions(int[] first, int[] second) {
		
		int numarator  = first[0]*second[1] + second[0]*first[1];
		int denomarator  = first[1]*second[1] ;
		
		int gcd = findGCD(numarator, denomarator);
		
		return ""+numarator/gcd+"/"+denomarator/gcd;
	}

	private static int findGCD(int a, int b) {
		if(b==0) {
			return a;
		} else {
			return findGCD(b, a%b);
		}
		
		
	}

}


