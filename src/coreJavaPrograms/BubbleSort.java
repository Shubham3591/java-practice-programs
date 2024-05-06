package coreJavaPrograms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int a[] = {4, 3, 2, 1, 4, 5, 6};


        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array is : " + Arrays.toString(a));

    }

}
