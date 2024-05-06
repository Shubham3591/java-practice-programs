package coreJavaPrograms;

public class CheckSubstringPresentInString {

    public static void main(String args[]){
    System.out.println(isSubstring("Shubham", "am"));
    }

    public static boolean isSubstring(String main, String sub){
        return main.contains(sub);

    }
}
