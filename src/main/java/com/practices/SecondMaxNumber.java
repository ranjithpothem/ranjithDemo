package com.practices;

public class SecondMaxNumber {
	public static void main(String[] args) {
		 int arr1[] ={33,12,78,55,23,89,111};
		 int fisrMaxNumber=arr1[0];
		 int secondMaxNumber=arr1[0]<arr1[1]?arr1[0]:arr1[1];
		 
		 for(int i=2;i<arr1.length;i++) {
			 if(arr1[i]>fisrMaxNumber) {
				 secondMaxNumber=fisrMaxNumber;
				 
				 fisrMaxNumber=arr1[i];
				 //System.out.println(fisrMaxNumber);
				 
			 }
			 else if(arr1[i]<fisrMaxNumber&&arr1[i]>secondMaxNumber) {
				 secondMaxNumber=arr1[i];
				 
			 }
		 }
		 
		 System.out.println(secondMaxNumber);
	}

}
