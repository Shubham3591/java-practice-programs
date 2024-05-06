package coreJavaPrograms;

public class DuplicateValuesInNumericarrays {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3,2, 4, 2, 7, 8, 8, 3, -3, -3 };

		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					System.out.println(arr[i]+":"+count);
					arr[j]=0;

				}

				
			}
		}
	}
}
