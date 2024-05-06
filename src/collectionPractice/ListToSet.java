package collectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListToSet {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		l.add("World");
		l.add("World");
		l.add("Hello");
		
		System.out.println(l);
		
		Set<String> S= new TreeSet<>();
		System.out.println(S);
		
		S.addAll(l);
		/*
		 * for(String s: l) { System.out.println(s); }
		 */
		System.out.println(S);

	}
}
