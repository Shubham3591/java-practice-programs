package coreJavaPrograms;

public class FactorialNumber {
	
	public static void main(String[] args) {
		System.out.println(factorialNumber(5));
		System.out.println(factorialNumber(0));
		System.out.println(factorialNumber(10));

		System.out.println(fact(0));
		System.out.println(fact(125));

	}
	
	public static int factorialNumber(int num) {
		
		if (num==0) {return 1;}
		
		int fact=1;
		
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		return fact;
	}	
	
	//recursive method
	public static int fact(int num){
		if (num==0)
			return 1;
		else
			return(num * fact(num-1));
	}


   /* public static void main(String[] args) {
        int num=123;
        int fact=1; 
        
        for(int i=1; i<num;i++){
            fact=fact*i;
        }
        
        System.out.println(fact);
    }*/

}
