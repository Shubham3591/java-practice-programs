package coreJavaPrograms;

public class FindarrayMissingNumber {

	public static void main(String[] args) {
		// Arrays must in defined range i.e. 1-5
		// Arrays must not contain duplicate values
		// Arrays can be jumbled, sequence doesn't require
		
		int a[]= {1,2,4,5};
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum1=sum1+a[i];
		}
		
		for(int i=0; i<=a.length+1; i++)
		{
			sum2=sum2+i;
		}
		
		System.out.print("Missing number is :"+ (sum2-sum1));
		
		


	}

}
