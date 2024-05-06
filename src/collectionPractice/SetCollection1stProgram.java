package collectionPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection1stProgram {
	
	public static void main(String[] args) {
		
		Set<String> S1=new HashSet<String>();
		S1.add("Set");
		S1.add("to");
		S1.add("demonstrate");
		S1.add("program");
		S1.add("program");
		S1.add(null);
		System.out.println("Set is: 	"+S1);
		
		S1.remove(null);
		System.out.println("Set is: 	"+S1);
		
		System.out.println(S1.contains("PROGRAM"));
		
		
	for (String S: S1) {
		System.out.println(S+" ");
	}
	
	System.out.println("***************");
	
	Iterator itr=S1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}

}

//There are 2 things to observe in the above program. 
//First, even if we have tried to insert a duplicate element, it was ignored by Set.
//Second, the order of insertion is not maintained while printing, which is another property of Set.