package com.pratice.interview;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// To find the position of the sum of the target number
		int inputLen =0,target =0,sum =0;
		int[] inputArray = null, resultArray =null;
		Scanner s = new Scanner(System.in);
		inputLen = s.nextInt();
		for(int i =0; i<inputLen;i++) {
			int x = s.nextInt();
			inputArray[i] = x;
			
		}
		System.out.println("Input Array:" +inputArray);
		target = s.nextInt();
		System.out.println("Input target:" +target);
		
		for(int i=0;i<inputLen;i++) {
			int first = inputArray[i];
			for(int j =0; j<inputLen; j++) {
				int second =inputArray[i];
				if(first != second && first+second == target) {
					resultArray[0] = i;
					resultArray[1] = j;
					
				}
					
			}
		}
	
		System.out.println("Result array:" +resultArray);
	}

}
