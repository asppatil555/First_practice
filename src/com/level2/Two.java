package com.level2;

import java.util.Scanner;

public class Two {
	
	public void m1(int a) {
		int original=a;
		int reversed=0;
		while(a !=0 ) {
		    int digit=a%10;
		     reversed=reversed*10+digit;
		     a=a/10;
		     
		}
		if(original==reversed) {
			System.out.println("it is palindrom");
		}
		else {
			System.out.println("it is not palindrom");
		}
		
		
	    
		
	
	}
	public static void main(String[] args) {
		Two a=new Two();
         a.m1(121);
	}
	

}
