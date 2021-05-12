package com.ojas.arrays.march02;

import java.util.Scanner;

public class SmallestOfArrayElements {
	static int smallestNumber(int[] num) {
		int small = num[0];
		for ( int i = 1; i < num.length; i++) {
			if (num[i] < small) {
				small = num[i];
			}
		}
		return small;		
	}
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the Enters");
	     int num[] = new int[5];
	     for (int i = 0; i < num.length; i++) {
	    	 num[i] = sc.nextInt();
	    			
		}
	     System.out.println("Smallest Number: "+smallestNumber(num));
		
		}

	}

