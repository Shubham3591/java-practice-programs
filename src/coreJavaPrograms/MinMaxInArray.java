package coreJavaPrograms;

public class MinMaxInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		int min = a[0];
		int max = a[0];

		for (int i = 0; i <a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("Minimum is: " + min + " And Max is :" + max);

	}
}