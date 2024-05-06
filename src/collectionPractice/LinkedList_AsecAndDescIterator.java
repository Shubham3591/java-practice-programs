package collectionPractice;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedList_AsecAndDescIterator {
	
	public static void main(String[] args) {
		
		//How to print elements of a LinkedList in reverse order?
		
		LinkedList<String> ll1=new LinkedList<String>();
		ll1.add("Tom");
		ll1.add("Dick");
		ll1.add("Harry");
		
		System.out.println("list is " +ll1);
		
		Iterator<String> i =ll1.descendingIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("******************* ");
		
Iterator<String> j =ll1.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		
	}

}
