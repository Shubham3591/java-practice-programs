package StringCharProblems;

public class StringWordProgram {
	/*
	public static void main(String[] args) {
		// Here we will see all string programs where we require to break sentence into
		// word
		// Here we need to require read string word by word

		
		
		
		
		// Program to print each word of sentence in separate line

		String s = "Java online Training";
		s += " ";
		String w = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				System.out.println(w);
				w = "";
			}
		}

		
		
		
		// Program to print each word first letter of word in String

		String s = "Java online Training";
		s += " ";
		String w = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				System.out.println(w.charAt(0));
				w = "";
			}
		}
		
		
		
		

		// print 1st two characters of each word

		String s = "Java online Training";
		s += " ";
		String w = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				System.out.println(w.substring(0, 2));
				w = "";
			}
		}
		
		
		

		// print only the words starting with T in a Sentence

		String s = "Java online Training";
		s += " ";
		String w = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				if (w.startsWith("T"))
					System.out.println(w);
				w = "";
			}
		}

		
		
		
		// print only the words ends with ng in a Sentence

		String s = "Java online Training";
		s += " ";
		String w = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				if (w.endsWith("ng"))
					System.out.println(w);
				w = "";
			}
		}
		
		
		

		// print only the words that contains e in a Sentence

		String s = "Java online Training";
		s += " ";
		String w = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				if (w.contains("e"))
					System.out.println(w);
				w = "";
			}
		}
		
		
		

		// print only the words having 3 characters in a Sentence

		String s = "Java C++ online Training";
		s += " ";
		String w = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				if (w.length() == 3)
					System.out.println(w);
				w = "";
			}
		}
		
		
		

		// print special words in a Sentence like Mom, Bob, Anna

		String s = "Java C++ online Training Bob Anna";
		s += " ";
		String w = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {

				char f = w.charAt(0);
				char l = w.charAt(w.length() - 1);
				if (Character.toUpperCase(f) == Character.toUpperCase(l))
					System.out.println(w);
				w = "";
			}
		}
		
		
		

		// print longest words in a Sentence

		String s = "Java C++ online Training Bob Anna";
		s += " ";
		String w = "";
		String lw = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {

				if (w.length() > lw.length())
					lw = w;
				w = "";
			}
		}
		System.out.println(lw);

		
		
		
		
		// print to find specific word present in a Sentence

		String s = "Java C++ online Training Bob Anna C++ Java";
		s += " ";
		String w = "";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				if (w.equals("C++"))
					count++;

				w = "";
			}

		}
		System.out.println(count);

		
		
		
		
		// Change RED with BLUE in a Sentence and print It

		String s = "A RED Seed";
		s += " ";
		String ns = "";
		String w = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				if (w.equals("RED"))
					ns = ns + "Blue" + " ";
				else
					ns = ns + w + " ";
				w = "";
			}
		}
		System.out.print(ns);

		
		
		// Delete the word RED in a Sentence and print It

		String s = "A RED Seed";
		s += " ";
		String ns = "";
		String w = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				if (!w.equals("RED"))
					ns = ns + w + " ";
				w = "";
			}
		}
		System.out.print(ns);

		
		
		
		// Take a sentence and change case of each Alternate word

		String s = "Java Online training for Students";
		s += " ";
		String w = "";
		String ns = "";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				if (count++ % 2 == 0)
					ns = ns + w.toUpperCase() + " ";
				else
					ns = ns + w.toLowerCase() + " ";
				w = "";
			}
		}
		System.out.print(ns);

		
		
		
		// Write a program to capitalize each word of the sentence

		String s = "java Online training For selenium";
		s += " ";
		String w = "";
		String ns = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				char f = w.charAt(0);
				f = Character.toUpperCase(f);
				ns = ns + f + w.substring(1) + " ";
				w = "";
			}
		}
		System.out.print(ns);

		
		
		// Program to swap first letter and last letter of each word of a sentence
		String s = "Java online Training";
		s += " ";
		String w = "";
		String ns = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ')
				w += c;
			else {
				char f = w.charAt(0);
				char l = w.charAt(w.length() - 1);
				String m = w.substring(1, w.length());
				ns = ns + l + m + f + " ";

				w = "";
			}
		}
		System.out.print(ns);  */

	}


