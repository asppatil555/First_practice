package com.level2;

public class Three {
	
	public void m1(int n) {
		if(n>0) {
			System.out.println(n+"Number is positive");
			
		}
		else if(n<0){
			System.out.println(n+"number is -ve");
			
		}
		else {
			System.out.println(n+"zero");
		}
	}
	
	
	public static void main(String[] args) {
		Three a=new Three();
		a.m1(0);
	}

}
