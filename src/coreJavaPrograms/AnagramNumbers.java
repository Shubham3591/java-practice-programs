package coreJavaPrograms;

import java.util.Arrays;

public class AnagramNumbers {

    public static void main(String[] args) {
        int a = 240;
        int b = 204;

        char[] c1 = (String.valueOf(a)).toCharArray();
        char[] c2 = (String.valueOf(b)).toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)) {
            System.out.println("are anagram");
        } else {
            System.out.println(" not anagram.");
        }
    }
}
