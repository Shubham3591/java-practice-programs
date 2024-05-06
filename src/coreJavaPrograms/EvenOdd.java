package coreJavaPrograms;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is not Even");
		}
	}

}
