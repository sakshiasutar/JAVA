package basic.programming;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int sum =0;
		
		for(int i=1;i<=n;i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum of First " + n + " Natural Number is : " + sum);
		
	}

}
