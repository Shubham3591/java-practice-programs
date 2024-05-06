package coreJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInAnArray {

	public static void main(String[] args) {
		Integer a[]={1,2,5,6,3,2};  
		
		
		int total=a.length;

		Arrays.sort(a);

		int secondLargestElement1=a[total-2];
		System.out.println("Second Largest: "+secondLargestElement1);

		
			List<Integer> list= new ArrayList<>(Arrays.asList(a));  
			Collections.sort(list);  
			
			int secondLargestElement=list.get(total-2);
			 
			System.out.println("Second Largest: "+secondLargestElement);

	}

}
