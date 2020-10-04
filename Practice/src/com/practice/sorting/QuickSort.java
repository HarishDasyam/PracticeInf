package com.practice.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in =new Scanner(System.in);
			System.out.println("Enter length:");
			int totalLength=in.nextInt();
			int[] arr = new int[totalLength];
			
			for(int i=0;i<totalLength;i++) {
				arr[i]=in.nextInt();
			}
			quickSort(arr,0,arr.length-1);
			
			System.out.println(Arrays.toString(arr));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void quickSort(int inputarr[],int low,int high) {
		int total[] = null;
		
		int middle=low+high/2;
		int pivot =inputarr[middle];
		int i=low,j=high;
		
		while(i<j) {
			while(inputarr[i]< pivot) {
				i++;
			}
			while(inputarr[j]> pivot) {
				j--;
			}
			if(i<=j) {
				swap(inputarr,i,j);
				i++;
				j--;
			}	
		}
		if (low < j){
            quickSort(inputarr, low, j);
        }
        if (high > i){
            quickSort(inputarr, i, high);
        }
	}
	public static void swap(int array[],int x,int y) {
		int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
	}
}
