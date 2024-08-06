package basic.programming;

import java.util.Scanner;

import java.util.Arrays;

public class ConcatenationOfArray {
	
	public static int[] getConcatenation(int [] arr) {
		int k = arr.length;
		int [] nums = new int[2*k];
		for(int i=0;i<k;i++) {
			nums[i] = arr[i];
			nums[i+k] = arr[i];
		}
		
		return nums;
		
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
		
		System.out.println();
		
		int [] result = getConcatenation(arr);
		System.out.println(Arrays.toString(result));

	}

}
