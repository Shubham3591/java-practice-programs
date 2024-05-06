package coreJavaPrograms;

public class CheckValidNumber {

    public static void main(String args[]){
        checkNumber("123a");

    }

    public static void checkNumber(String num){
      try {
          Long.parseLong(num);
          System.out.println("Valid");
      }catch (NumberFormatException e){
          System.out.println("Not Valid");
      }
    }

    public static void isPhoneNo(String num){
        if(num.length()==10 ){
            System.out.println("valid phone no.");
        }
    }
}
