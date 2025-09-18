package com.first;

import java.util.Scanner;



public class Sscanner {
public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name:");
	String name=sc.next();
	System.out.println("Enter last name:");
	String lname=sc.next();
	System.out.println("Enter email");
	String email=sc.next();
	
	System.out.println(name+ " "+ lname+" "+email);
	
}
}
