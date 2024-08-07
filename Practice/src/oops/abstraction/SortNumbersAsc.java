package oops.abstraction;

import java.util.Scanner;

public class SortNumbersAsc {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the size of Array");
	   int n = sc.nextInt();
	   int[] arr = new int[n];
	   int temp = 0;
	   
	   System.out.println("Enter the elements in array:");
	   for(int i=0;i<arr.length;i++) {
		   arr[i] = sc.nextInt();
	   }
	   
	   System.out.println("Original Array:");
	   for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
	   
	   for(int i=0;i<arr.length;i++) {
		   for(int j=i+1;j<arr.length;j++) {
			   if(arr[i] > arr[j]) {
				   temp = arr[i];
				   arr[i] = arr[j];
				   arr[j] = temp;
			   }
		   }
	   }
	   
	   System.out.println();
	   System.out.println("Array after sorting:");
	   for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i] + " ");
	   }
   }
}
