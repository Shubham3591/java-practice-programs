package collectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterateusing_Iterator {

	public static void main(String[] args) {
		
		final Collection<String> c1= new ArrayList<String>();
		c1.add("One");
		c1.add("two");
		c1.add("three");
		c1.remove("two");
		
		Iterator<String> itr=c1.iterator();
		
		while(itr.hasNext())
		{System.out.println("value =" +itr.next());}
		
		System.out.println(c1);
		

	}

}
