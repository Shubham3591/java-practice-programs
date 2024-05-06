package coreJavaPrograms;

public class DuplicateCharactersAndtheirCountinString {

	public static void main(String[] args) {

		String s = "aAabbbbbbbccddeaAfghhh";
		String s1 = s.toLowerCase();
		char c[] = s1.toCharArray();
		System.out.println(c);

		for (int i = 0; i < s.length(); i++) 
		{

			int count = 1;
			for (int j = i + 1; j < s.length(); j++) 
			{
				if (c[i] == c[j])
				{
					count++;

					c[j] = '0';
				}
			}

			if (count>1 && c[i] != '0')
				System.out.print(c[i] + "" + count);

		}

	}

}
