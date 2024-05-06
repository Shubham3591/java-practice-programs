package coreJavaPrograms;


public class Testgeneric {

	public static void main(String[] args) {
		
		String s="Shubham";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c=='h')
			System.out.println(i);
		}
		
	}

}
