package coreJavaPrograms;

import java.util.Scanner;

public class MultiplicationOfNumber {
	
	public static void main(String []args){
        
        Scanner s= new Scanner(System.in);
       System.out.println("Enter number:");
       int num=s.nextInt();
       s.close();
       
       for(int i=1; i<=10; i++)
       {
           System.out.println(num+"X"+i+"="+(num*i));
       }
    }

}
