package coreJavaPrograms;

public class EvenAddInArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int num[] = {1, 2, 3, 4, 5};

        for (int n : num) {
            if (n % 2 == 0) {
                System.out.println(n + " is Even");
            } else {
                System.out.println(n + " is Odd");
            }
        }

    }

}
