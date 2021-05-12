package com.ojas.arrays.march02;

import java.util.Scanner;

public class ReverseOfArray {
	   static int[] reverseArray(int num[]) {
		   int[] rev = new int[num.length];
		   int k = 0; 
		   for (int i = num.length-1; i >= 0; i--) {
			     rev[k] = num[i];
			     k++;
		   }
		   return rev;
	   }
	   
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num[] = new int[5];
		for ( int i = 1; i < num.length; i++) {
			   num[i] = sc.nextInt();
		}
		for (int x : num) {
			System.out.println(x);
		}

	}

}
