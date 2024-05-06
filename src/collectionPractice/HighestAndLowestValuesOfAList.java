package collectionPractice;

import java.util.Collections;
import java.util.LinkedList;

public class HighestAndLowestValuesOfAList {
	
public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		System.out.println(ll);
		
		System.out.println(Collections.min(ll));
		System.out.println(Collections.max(ll));
		

}}
