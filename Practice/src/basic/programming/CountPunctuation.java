package basic.programming;

import java.util.Scanner;

public class CountPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '!' || str.charAt(i) == '-' || str.charAt(i) == ':' || str.charAt(i) == ';' || str.charAt(i) == ',' ||str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '\'' || str.charAt(i) == '\"'  ) {
				count++;
			}
		}
		System.out.println("The number of punctuations exists in the string is: " +count); 
	}

}
