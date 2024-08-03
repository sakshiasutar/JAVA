package basic.programming;

import java.util.Scanner;

public class SmallestNumberUsingTerneryOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Number:");
		int b = sc.nextInt();
		
		System.out.println("Enter the Third Number:");
		int c = sc.nextInt();
		
		int temp = a<b ? a:b;
		
		int smallest = c<temp? c:temp;
		
		System.out.println("The smallest number is : " + smallest);
	}

}
