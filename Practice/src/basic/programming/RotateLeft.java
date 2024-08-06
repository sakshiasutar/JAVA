package basic.programming;

import java.util.Scanner;

public class RotateLeft {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arr:");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter the elements in the arr:");
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Number of times you want to rotate your array");
		int n = sc.nextInt();
		
		System.out.println("Original Array");
		 for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
		 System.out.println();
		 
		 for(int i=0;i<n;i++) {
			 int first = arr[0];
			 int j=0;
			 for(j=0;j<arr.length-1;j++) {
				 arr[j] = arr[j+1];
			 }
			 arr[j] = first;
			 
		 }
		 System.out.println();
		 
		 System.out.println("Rotated array:");
		 for(int k = 0; k< arr.length; k++){  
	            System.out.print(arr[k] + " ");  
	        }  
	}

}
