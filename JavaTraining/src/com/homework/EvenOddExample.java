package com.homework;

public class EvenOddExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //define the limit
        int limit = 10;
       
        System.out.println("Printing Even & Odd numbers between 1 and " + limit);
        
        for(int i=1; i <= limit; i++){
               
                //if the number is not divisible by 2 then it is odd
                if( i % 2 != 0){
                        System.out.print(""+i);
                }
             
            
          }
        
        System.out.println("\n");
        
        for(int i=1; i <= limit; i++){
            

            if( i % 2 == 0){
                    System.out.print(""+i);
            }
         
        
      }
	}

}
