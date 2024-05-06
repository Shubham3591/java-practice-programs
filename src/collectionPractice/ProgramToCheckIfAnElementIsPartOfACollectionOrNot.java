package collectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProgramToCheckIfAnElementIsPartOfACollectionOrNot {
	
	public static void main(String[] args) {
		
		List<String> l= new ArrayList<>();
	    l.add("Ram");
	    l.add("Shayam");
	    l.add("Sita");
	    
	    System.out.println(l);
	    
	    System.out.println(l.contains("Shubham"));
	    System.out.println(l.contains("Ram"));
	    
	    
	    Map<Integer, String> m=new TreeMap<>();
	    m.put(1,"Ram");
	    m.put(3, "Sita");
	    m.put(2, "Shayam");
	    
	    System.out.println(m);
	    
	    System.out.println(m.containsKey(4));
	    System.out.println(m.containsKey(3));
	    System.out.println(m.containsValue("Shubham"));
	    System.out.println(m.containsValue("Ram"));
		
	}

}
