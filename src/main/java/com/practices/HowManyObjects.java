package com.practices;

import java.util.Scanner;

public class HowManyObjects {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int l=scanner.nextInt();
		int[] arr=new int[l];
		int max=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		

		scanner.close();
	}

}
