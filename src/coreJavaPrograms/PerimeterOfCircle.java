package coreJavaPrograms;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter radius");
		
		double r=s.nextDouble();
		
		s.close();
		
		
		System.out.println("Perimeter is :" +(2*Math.PI*r));
				
	}
}
