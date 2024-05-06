package coreJavaPrograms;

public class ProgramToSwapTwoStrings {
	
	public static void main(String[] args) {
		String a="hello";
		String b="World";
		
		System.out.println("Before Swapping a is:	" +a+ " 	b is" +b);
		
		a=a+b;

		System.out.println(a.length()-b.length());
		
		b=a.substring(0, a.length()-b.length() );
		System.out.println(b);
		
		a=a.substring(b.length());
		
		System.out.println("After Swapping a is:	" +a+ " 	b is " +b);

	}

}
