package com.method;

public class Calculator {
	
	
	public void m1(int a, int b) {
	int	c=a+b;
	System.out.println("Addition: "+ c);
		
	}
	
	public void m2(int a, int b) {
		int c=a-b;
		System.out.println("Substraction: "+c);
	}
	
	
	public void m3(int a, int b) {
		int c=a*b;
		System.out.println("Multi: "+c);
	}
	
	public void m4(int a, int b) {
		int c=a/b;
		System.out.println("division: "+c);
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.m1(10, 200);
		c.m2(50, 10);
		c.m3(10, 100);
		c.m4(100, 10);
	}

}
