package coreJavaPrograms;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome to Selenium Training";
		String [] words= s.split(" ");
		String reverseString="";
		
		String a[]= {"java", "c++", "c++", "java", "Python", "C++" };
		
		//for(String w: a)
		
		for(String w: words) 
		{
			String reverseWord="";
			
			for (int i=w.length()-1; i>=0; i--) 
			{
				
				reverseWord=reverseWord+ w.charAt(i);
			}
			
			reverseString=reverseString + reverseWord+" ";
		}
		
		System.out.println("Reverse Each Word In A String : "+reverseString);
	}

}
