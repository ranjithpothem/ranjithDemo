package com.practices;

public class LastWordLengthInString {

	public static void main(String[] args) {
		String string="hello ranjith pothem  ";
		int count=0;
		for(int i=string.length()-1;i>0;i--) {
			if(string.charAt(i)!=' ') {
				count++;
			}
			else if (string.charAt(i)==' ' && count!=0) {
			break;	
			}
		}
		System.out.println(count);

	}

}
