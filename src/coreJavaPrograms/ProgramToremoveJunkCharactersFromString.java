package coreJavaPrograms;

public class ProgramToremoveJunkCharactersFromString {
	
	public static void main(String[] args) {
		
		String s1= "@$#Testing@$#Selenium@$#";
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
				System.out.println(s1);
	}

}
