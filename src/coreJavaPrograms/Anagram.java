package coreJavaPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String args[]) {
        String str1 = "Race";
        String str2 = "Care";

        if (str1.length() == str2.length()) {

            char[] c1 = str1.toLowerCase().toCharArray();
            char[] c2 = str2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if (Arrays.equals(c1, c2)) {
                System.out.println("are anagram");
            }
        } else {
            System.out.println(" not anagram.");
        }
    }
}
