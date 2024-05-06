package coreJavaPrograms;

import java.util.Scanner;

public class PowerOfNumber {
public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter number");
		int num=s.nextInt();
		
		int intialNumber=num;
		
		System.out.println("Enter power");
		int power=s.nextInt();
		
		s.close();
		
		for (int i=1; i<power; i++)
		{
			
			num=intialNumber*num;
		}
		
		System.out.println(num);

		
		
}

}
