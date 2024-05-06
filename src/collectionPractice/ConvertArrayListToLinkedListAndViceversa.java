package collectionPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertArrayListToLinkedListAndViceversa {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		System.out.println(ll);
		
		
		// Converting LinkedList to ArrayList
		ArrayList<Integer> A=new ArrayList<>(ll);
		System.out.println(A);
		
		
		// Converting ArrayList to LinkedList
		LinkedList<Integer> B=new LinkedList<>(A);
		System.out.println(B);
		
		

	}
}
