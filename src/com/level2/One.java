package com.level2;

import java.util.Scanner;

public class One {
	
	public void m1() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=0;
		for(int a=1;a<=n;a++) {
			
			System.out.print(b=+a);
		}
		
	}
	public static void main(String[] args) {
		One h=new One();
		h.m1();
	}

}
