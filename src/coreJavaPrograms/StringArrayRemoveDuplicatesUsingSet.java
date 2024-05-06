package coreJavaPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class StringArrayRemoveDuplicatesUsingSet {

	public static void main(String[] args) {

	
		        String s= "My name is shubham shubham name";
		        
		        String[] strColors=s.split(" ");
		        
				/*
				 * String[] strColors = { "red", "blue", "green", "red", //duplicate "yellow",
				 * "green" //duplicate };
				 */
		        System.out.println("Original array: " 
		                    + Arrays.toString(strColors));
		        
		        /*
		         * convert array to list and then add all
		         * elements to LinkedHashSet. LinkedHashSet
		         * will automatically remove all duplicate elements. 
		         */
		        LinkedHashSet<String> lhSetColors =  
		                new LinkedHashSet<String>(Arrays.asList(strColors));
		        System.out.println("collection after removing duplicates " +lhSetColors);
		        
		        //create array from the LinkedHashSet
		        String[] newArray = lhSetColors.toArray(new String[ lhSetColors.size() ]);
		        
		        
		        System.out.println("Array after removing duplicates: " 
		                + Arrays.toString(newArray));
		        	        
		        

	}

}
