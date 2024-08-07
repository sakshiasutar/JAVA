package basic.programming.problems;

import java.util.Scanner;

public class PermutationDifferenceBetweenTwoStrings {
	
	public static int permutationDiff(String str1, String str2) {
		int score = 0;
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					score += Math.abs(i-j);
				}
			}
		}
		return score;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the String2:");
		String str2 = sc.nextLine();
		
		System.out.println(permutationDiff(str1,str2));

	}

}
