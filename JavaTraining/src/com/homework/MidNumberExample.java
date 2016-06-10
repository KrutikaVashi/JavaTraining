package com.homework;

public class MidNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5,b=13,c=11;
		 
		//Checking for a is middle number or not
		if( b>a && a>c || c>a && a>b )
		{
			System.out.println("a is middle number");
			
		}
 
        //Checking for b is middle number or not
		if( a>b && b>c || c>b && b>a )
		{
			System.out.println("b is middle number");
			
		}
 
        //Checking for c is middle number or not
		if( a>c && c>b || b>c && c>a )
		{
			System.out.println("c is middle number");
			
		}
	}

}
