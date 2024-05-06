package collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {
	public static void main(String[] args) {
		
		Set<String> S= new HashSet<>();
		S.add("World");
		S.add("Hello");
		S.add("World");
		S.add("Hello");
		
		System.out.println(S);
		
		List<String> l=new ArrayList<>();
		
		l.addAll(S);
		System.out.println(l);
	}

}
