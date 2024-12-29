package com.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {
	
	private static boolean isPalindrome(int x) {
		String str=Integer.toBinaryString(x);
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	 private static List<Integer> palindrome(int x){
		 int number=0;
		 List<Integer> list=new ArrayList<>();
		 while(list.size()>x) {
			 number++;
			 if(isPalindrome(number)) {
				 list.add(number);
			 }
		 }
		 return list;
	 }
	 
	 private static int usingMethod(List<Integer> list,int x) {
		 return list.get(x-1);
	 }
	 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int[] arr=new int[l];
		int max=0;
		for(int i=0;i<l;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		List<Integer> list=palindrome(max);
		
		for(int n:arr) {
			System.out.println(usingMethod(list,n));
		}
		sc.close();

	}

}
