package com.ojas.arrays.march02;

public class ReverseOfNumber {
	
	static int reverseOfNumber(int number) {
		int rem = 0, rev = 0;
		while(number > 0) {
			rem = number % 10;
			rev = (rev*10)+rem;
			number = number/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		System.out.println("ReverseOfNumber :"+reverseOfNumber(134));		
	}

}
                                                                      