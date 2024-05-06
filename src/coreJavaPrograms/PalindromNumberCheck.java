package coreJavaPrograms;


public class PalindromNumberCheck {
	
	public static void main(String[] args) {
		int number, reverse, temp, remainder;
		number=121;
		temp=number;
		reverse=0;
		
		
		while(temp!=0)
		{
			remainder=temp%10;
			reverse=reverse*10+remainder;
			temp=temp/10;
		}
		System.out.println();
		
		if(number==reverse)
		{
			System.out.println(number +"  Number is palindrome  ");
		}
		else {
			System.out.println(number+"  Number is not palindrome  ");
		}
	}

}
