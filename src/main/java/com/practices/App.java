package com.practices;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       String str="aba";
       int k=3;
       sub(str,k);
      
    }
    public static void sub(String str1, int k1) {
    	StringBuilder str3 = new StringBuilder();
    	for(int i=0;i<str1.length();i++) {
    		char c=str1.charAt(i);
    		str3.append(c);
    		if(str3.length()==k1) {
    			System.out.println(str3);
    		}
    	}
    	
    }
}
