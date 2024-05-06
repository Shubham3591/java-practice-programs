package coreJavaPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {20,30,40,50,60,70};
		int search_ele=100;
		
		boolean flag=false;
		
		for (int i=0; i<a.length; i++) {
			if(a[i]==search_ele) {
				System.out.println("Element found at index : "+i);
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}

}
