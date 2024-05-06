package coreJavaPrograms;

import java.util.Arrays;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		

		
		  String s = "big black bug bit a big black dog on his big black nose";
		  s.toLowerCase();
		  String[] words = s.split(" ");
												  
		  int count;
		  System.out.println("Given String is  : "+s);
		  System.out.println("Duplicate words  : ");
		  for (int i = 0; i < words.length; i++) 
		  { 	
			  count = 1; 
		  		for (int j = i + 1; j < words.length; j++)
		  		{ if (words[i].equals(words[j])) 
		  			{ count++; 
		  			// Set words[j] to 0 to avoid printing visited word 
		  			words[j]="0";
		  			}	 
		  		}
		  		
		  	if (count > 1 && words[i] != "0")
		    System.out.println(words[i]+ ": "+count+ "    ");
		  }
	
		  
		  
	}
}
