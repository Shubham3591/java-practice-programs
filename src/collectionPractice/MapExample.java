package collectionPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
	
	public static void main (String[] args) {
		
		//Map<Integer, String> M= new HashMap<>();		//insertion order is not maintained
		Map<Integer, String> M= new LinkedHashMap<>();  //insertion order is maintained
		
		//Map<Integer, String> M= new TreeMap<>();		//Null key is not allowed, TreeMap sorted the elements based on the key
		
		M.put(1, "One");
		M.put(2, "Two");
		M.put(5, "Five");		
		M.put(3, null);
		/*
		 * M.put(null, "Three"); M.put(null, null);
		 */
		
		System.out.println(M);
		
		M.replace(3, "Four");
		System.out.println(M);
		
		M.put(3, "Five");
		System.out.println(M);
		
		M.remove(3);
		System.out.println(M);
		
		for (Map.Entry <Integer, String > e : M.entrySet()) {
			int key = e.getKey();
		String value = e.getValue();

		System.out.println(key + " : " + value);
		}

		
	}

}
