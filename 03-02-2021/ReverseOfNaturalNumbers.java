package com.ojas.arrays.march02;

public class ReverseOfNaturalNumbers {
	
	static String reverseNumbers(int startValue, int endValue) {
		String res = "";
		int i = endValue;
		while(i >= startValue) {
			res += i+ " ";
			i--;
		}
		return res.substring(0, res.length()-1);
		
	}
	public static void main(String[] args) {
		
		System.out.println("ReverseOfNumbers : "+reverseNumbers(1,15));

	}

}
