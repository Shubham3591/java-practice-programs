package collectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterfacePractice_ListIterator {
	
	public static void main(String[] args){
		
		ListIterator<Integer> litr=null;
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		
		for(Integer i: l1) {
			
			System.out.println("Value="+i);
			
		}
		
		System.out.println(l1);
		
		List<Integer> l2= new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		System.out.println("Value of l2 is  "+l2);
		
		l1.addAll(2, l2);
		System.out.println("Value of l1 after addition is   "+l1);
		System.out.println(l1.get(2));
		
		l1.remove(2);
		System.out.println("Value of l1 after removal is    "+l1);
		System.out.println(l1.get(2));
		
		l1.set(0, 5);
		System.out.println("Value of l1 after set is        "+l1);
		
		System.out.println("***********************");
		
		
		litr=l1.listIterator();
		
		while(litr.hasNext()) {System.out.print(litr.next());}
		
		System.out.println("***********************");
		
		while(litr.hasPrevious()) {System.out.print(litr.previous());}

		
		
		


	}

}
