package basic.programming.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String:");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Second String:");
		String str2 = sc.nextLine();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() != str2.length()) {
			System.out.println("Both the strings are not Anagram");
		}
		else {
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2) == true) {
				System.out.println("Both the strings are anagram");
			}
			else {
				System.out.println("Both the strings are not anagram");
			}
			
		}
		
		
	}

}
