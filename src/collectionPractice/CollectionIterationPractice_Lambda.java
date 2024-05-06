package collectionPractice;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionIterationPractice_Lambda {

	public static void main(String[] args) {
		
		Collection<String> c1= new ArrayList<String>();
			c1.add("Zero");
			c1.add("One");
			c1.add("two"); 	
			for (String s: c1) {
				System.out.println("Value =" +s);
			}
	}

}
