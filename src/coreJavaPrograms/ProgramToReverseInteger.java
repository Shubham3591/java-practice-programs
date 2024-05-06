package coreJavaPrograms;

public class ProgramToReverseInteger {
	
	public static void main(String[] args) {
		
		long num=12345;
		long rev=0;
		long rem=0;
		
		while(num !=0)		
		{			
			rem=num % 10;
			rev=rev*10 +rem;
			num= num/10;
		}
		
		System.out.println("Reverse number is " +rev);
	}

}
