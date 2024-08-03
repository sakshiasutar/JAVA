package basic.programming;

import java.util.Scanner;

public class SumOfEvenNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2 == 0) {
			sum = sum + i;
			}
		}
		
		System.out.println("The Sum of First "+ n + " Odd Number is : " + sum);
		

	}

}
