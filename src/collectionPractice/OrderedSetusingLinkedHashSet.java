package collectionPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrderedSetusingLinkedHashSet {
	
	//	We can use LinkedHashSet class to achieve this.
	
	public static void main(String[] args) {
		Set<String> S1=new LinkedHashSet<String>();
		S1.add("LinkedHashSet");
		S1.add("is");
		S1.add("used");
		S1.add("for");
		S1.add("Ordered Set");
		System.out.println("LinkedHashSet is : 	"+S1);
	}

}

//LinkedHashSet extends Hashset class, so it inherits all properties of HashSet,
 //but additionally offers ordering of element based on insertion sequence.