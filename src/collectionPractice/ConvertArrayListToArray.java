package collectionPractice;

import java.util.ArrayList;

public class ConvertArrayListToArray {
	
	//How to convert an ArrayList to an Array 
	
	public static void main(String[] args) {
		
		 ArrayList<String> A1 =new ArrayList<String>();
		A1.add("Tom");
		A1.add("Dick");
		A1.add("Harry");
		
		System.out.println("ArrayList is:   "+A1);
		
		String[] A2= new String[A1.size()];
		A1.toArray(A2);
		
		System.out.print("Array is:  	 ");
		for(String S: A2) {
			System.out.print(S +",");
		}
	
	System.out.println("");
	
	ArrayList<Integer> I1= new ArrayList<Integer>();
	
		I1.add(1);
		I1.add(2);
		I1.add(3);
		
		System.out.println("ArrayList is :   "+I1);
		
		Integer[] I2=new Integer[I1.size()];
		I1.toArray(I2);
		
		System.out.print("Array is	:	");
		for(int i: I2) {
			System.out.print(i +",");
		}

}}
