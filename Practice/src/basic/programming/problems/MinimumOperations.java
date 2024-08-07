// Find Minimum Operations to Make All Elements Divisible by Three

package basic.programming.problems;

import java.util.Scanner;

public class MinimumOperations {
	
	public static int minOperations(int[] arr) {
		int operations = 0;
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			int rem = num%3;
			if(rem == 1) {
				operations += 1;
			}
			else if(rem == 2) {
				operations += 1;
			}
		}
		return operations;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Number of Operations to make all elements divisible by 3:");
		System.out.println(minOperations(arr));

	}

}
