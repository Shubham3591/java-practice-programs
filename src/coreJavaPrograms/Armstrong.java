package coreJavaPrograms;

public class Armstrong {
    public static void main(String args[]){


        int n =153, rem, temp, arm=0;
        temp=n;

        while(temp>0)
        {
            rem=temp%10;
            arm= (rem * rem * rem)+arm;
            temp=temp/10;
        }

        if (n==arm){
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("not Armstrong");
        }
    }


}
