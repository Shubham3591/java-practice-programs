package coreJavaPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateIntegerInArray {

	public static void main(String[] args) {
		
        Integer[] numbers =  {1,2,3,4,5,1,3,5};
         
        //This array has duplicate elements
        System.out.println( Arrays.toString(numbers) );
         
        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
         
        System.out.println("Printing set " +linkedHashSet);
        
        
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
         
        
        
        //Verify the array content
        System.out.println("Printing Array " +Arrays.toString(numbersWithoutDuplicates) );
    }
	}


