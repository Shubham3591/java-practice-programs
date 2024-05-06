package coreJavaPrograms;

public class Average {

    public static void main(String args[]){
        int num[]={1,2,3,4,5,6,7};
        int total=0;

        for(int n: num) {
            total = total + n;
        }

        System.out.println("Avg is: "+(total)/num.length);
    }
}
