package com.homework;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		//Prime Number: 1 2 3 5 7  
        
		int limit = 10;
       
        System.out.println("Prime numbers between 1 and " + limit);
       
        
        for(int i=1; i < 10; i++){
               
                boolean isPrime = true;
               
        
                for(int j=2; j < i ; j++){
                       
                        if(i % j == 0){
                                isPrime = false;
                                break;
                        }
                }
                // print the number
                if(isPrime)
                        System.out.print(i + " ");
        }
	}

}
