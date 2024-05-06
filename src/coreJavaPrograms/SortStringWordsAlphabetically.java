package coreJavaPrograms;

import java.util.Arrays;

public class SortStringWordsAlphabetically {

	public static void main(String[] args) {
		String s1="my Name is Shubham";
		String [] word=s1.split(" ");
		Arrays.sort(word);
		
		System.out.println(Arrays.toString(word));

	}

}
