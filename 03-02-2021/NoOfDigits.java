package com.ojas.arrays.march02;

public class NoOfDigits {
	
	static int countNoOfDigits(int number) {
		int count = 0;
		while (number > 0) {
			count = count+1;
			number = number/10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("No of Digits:"+countNoOfDigits(13490));
          
	}

}
