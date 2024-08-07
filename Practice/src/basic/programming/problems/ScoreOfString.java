//You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

package basic.programming.problems;

import java.util.*;

public class ScoreOfString {
	
	public static int score(String n) {
		int score = 0;
		for(int i=0;i<n.length()-1;i++) {
			score += Math.abs(n.charAt(i) - n.charAt(i+1));
		}
		
		return score;
	}
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String n = sc.nextLine();
		
        System.out.println(score(n));
	}

}
