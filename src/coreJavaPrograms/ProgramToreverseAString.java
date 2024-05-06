package coreJavaPrograms;

public class ProgramToreverseAString {
	
	public static void main(String[] args) {
		String s="Rahul Shetty Acadmey";
		String ns="";
		
		for(int i=(s.length()-1); i>=0; i--) {
			ns=ns+s.charAt(i);
		}
		System.out.print("Value of B is:	" +ns);
		
	}

}
