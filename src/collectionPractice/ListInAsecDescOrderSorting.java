package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListInAsecDescOrderSorting {
	
	//How do we sort a List in ascending and descending order?

		public static void main(String[] args) {
			ArrayList<Integer> A1=new ArrayList<Integer>();
			
			A1.add(101);
			A1.add(301);
			A1.add(501);
			A1.add(801);
			A1.add(115);
			
			System.out.println(A1);
			
			Collections.sort(A1);
			System.out.println(A1);
			
			Iterator<Integer> i=A1.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			
			System.out.println("***********************");
			
			Collections.reverse(A1);
			System.out.println(A1);
			
			Iterator<Integer> j=A1.iterator(); 
			while(j.hasNext()) 
			{ System.out.println(j.next()); }
		}
}
