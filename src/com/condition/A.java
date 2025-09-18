package com.condition;



public class A {
	
		
	

		//Task 1
		public void m1(int a) {
		
			if(a<=10) {
				System.out.println("Hi Akshay");
				
			}
			else  {
				System.out.println("By Akshay");
			}
			
		
		}
		
		//Task 2
	
	public void m2(int b) {
			
	if(b!=10) {
		System.out.println("Hi Aashish");
		
		
	}
	else {
		System.out.println("By Aashish");
	}
	
	}
	
	//Task 3
	public void m3(int d) {
		if(d <= 99 && d>=91) {
			System.out.println("Gred A");
			
		}
		else if(d<=90 && d>=81) {
			System.out.println("Grad B");
		}
		
		else if(d<=80 && d>=71) {
			System.out.println("Grad c");
		}
		
		else {
			System.out.println("Grad D");
		}
		
	}
	
	public void m4(int time) {
		if(time ==10) {
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
	A c=new A();
	c.m1(9);
	c.m2(8);
	c.m3(90);
	
	
	}
	
}
