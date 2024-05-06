package coreJavaPrograms;

import java.util.Scanner;

public class AddTwoNumber {
	
	public static void main(String [] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number :");
		int a= s.nextInt();
		System.out.println("Enter Number :");
		int b= s.nextInt();
		s.close();
		
		System.out.println("Sum is :"+(a+b));
	}

}
