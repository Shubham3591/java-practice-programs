package coreJavaPrograms;

public class ProgramToSwapTwoIntegers {
	public static void main(String[] args) {
		int a=15;
		int b=100;
		System.out.println("A is:  "+a+ "  b is:  "+b);

		
		a=a+b;
		
		b=a-b;
		a=a-b;
		System.out.println("A is:  "+a+ "  b is:  "+b);

	}

}
