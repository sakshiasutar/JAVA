package basic.programming;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arr:");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter the elements in the arr:");
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Duplicate elements in given array: ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);  
				}
			}
		}
	}

}
