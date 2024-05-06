package coreJavaPrograms;

public class DuplicateWordsInStringOfArray {

	public static void main(String[] args) {


		String a[] = { "java", "c++", "c++", "java", "Python", "c++" };

	System.out.print("duplicate elements   ");
		for (int i = 0; i < a.length; i++) {
				int count=1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])  ) {
					
					count++;
					
					a[j]="0";
					
				}
			}
			if (count>1 && a[i]!="0") {
				System.out.print( a[i]+""+count+ " " );
			}
		}
		

	}

}
