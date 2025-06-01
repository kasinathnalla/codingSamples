package com.learning;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	 public static List<Integer> primeFactors(int number) {
		 List<Integer> factors = new ArrayList<Integer>();
		 while(number%2==0) {
			 factors.add(2);
			 number/=2;
		 }

		 for(int i=3; i< Math.sqrt(number); i=i+2) {
			 while(number%i==0) {
				 factors.add(i);
				 number/=i; 
			 }
		 }
		 if (number > 2) {
	            factors.add(number);
	        }
		 return factors;
	 }
	 
	 
	 public static void main(String[] a) {
		 int inputNumber = 104;

	        List<Integer> primeFactorsList = primeFactors(inputNumber);

	        System.out.println("Prime factors of " + inputNumber + ": " + primeFactorsList);
	 
		 
	}

}
