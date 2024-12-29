package com.practices;

public class BinarySearchExample {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,9,13,15,23,26,28,46,48,55,68};
		int k=5;
		
		int result=usingBinarySearch(arr,k,0,arr.length-1);
		if(result==-1) {
			System.out.println("Not found");
		}
		else {
			System.out.println("Number found");
		}

	}
	private static int usingBinarySearch(int arr[],int k,int left,int right) {
		if(left>right) {
			System.out.println("left"+left+" right"+right);
			return -1;
		}
		int middle=(left+right)/2;
		if(arr[middle]==k) {
			return k;
		}
		else if(k<arr[middle]) {
		return	usingBinarySearch(arr, k, left, middle-1);
		}
		else  {
			return usingBinarySearch(arr, k, middle+1, right);
		}
	
	}

}
