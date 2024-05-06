package coreJavaPrograms;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s2=" Welcome to Selenium Training ";
		String s=s2.trim();
	
		
		int count=1;
		
		for(int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
				count++;
			
			}
		}
		
		System.out.println(count);	
		
	
		String [] s1=s.split(" ");
		System.out.println(s1.length);
	}

}
