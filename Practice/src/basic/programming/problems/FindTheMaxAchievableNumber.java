package basic.programming.problems;

import java.util.*;

public class FindTheMaxAchievableNumber {
	
	public static int findTheMaxAchievableNumber(int num, int t) {
		return num + 2*t;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num : ");
		int num = sc.nextInt();
		
		System.out.println("Enter the value of t:");
		int t = sc.nextInt();
		
		System.out.println(findTheMaxAchievableNumber(num,t));
	}

}
