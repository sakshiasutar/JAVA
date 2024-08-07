package basic.programming.problems;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arr:");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter the elements in the arr:");
		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("The Original Array:");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		int arr2[] = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("The Copied Array:");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
}
