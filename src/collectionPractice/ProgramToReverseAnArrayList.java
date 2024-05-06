package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ProgramToReverseAnArrayList {
	public static void main(String[] args)
	{
		ArrayList<String> a= new ArrayList<>();
		a.add("Ajay");
		a.add("Vijay");
		a.add("RAm");
		a.add("Shayam");
		
		System.out.println(a);
		
		 Collections.reverse(a);
		//Iterator i= a.iterator();		
		System.out.println(a);
		
		
	}

}
