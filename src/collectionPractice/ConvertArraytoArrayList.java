package collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraytoArrayList {
	
	//How to convert an array to an ArrayList 
	
	public static void main(String[] args) {
		convertToArrayList();
	}
	
	public static ArrayList<String> convertToArrayList() {
		
		String[] A1= {"Shubam", "Ram", "Kartik" };
		System.out.print("Array is :	"+Arrays.toString(A1));
		
		System.out.println();
		ArrayList<String> A2=new ArrayList<String>(Arrays.asList(A1));
		System.out.println("ArrayList is: 	"+A2);
		return A2;
	}
}
