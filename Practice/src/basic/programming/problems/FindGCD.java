package basic.programming.problems;

import java.util.Scanner;

public class FindGCD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		
		int gcd = 1;
		
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i == 0 && b%i == 0) {
			gcd = i;
			}
		}
		
		System.out.printf("GCD of %d and %d is : %d",a,b,gcd);
		
	}

}
