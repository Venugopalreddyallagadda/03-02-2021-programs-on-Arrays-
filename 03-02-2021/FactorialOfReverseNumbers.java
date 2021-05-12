package com.ojas.arrays.march02;

public class FactorialOfReverseNumbers {
	static String findFactorial(int number) {
		String res = "";
		int fact = 1; 
		while(number > 0) {
			res = res+number+"*";
			fact = fact*number;
			number--;
		}
		return res.substring(0, res.length()-1)+ "="+fact;
	}		
	public static void main(String[] args) {
		System.out.println("Factorial of Reverse numbers: "+findFactorial(5));
		
	}

}
