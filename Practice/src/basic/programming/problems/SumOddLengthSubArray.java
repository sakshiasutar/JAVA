package basic.programming.problems;

import java.util.*;

public class SumOddLengthSubArray {
	
	public static int sumOddLengthSubArray(int [] arr) {
		int totalsum = 0;
		int l = arr.length;
		for(int i=0;i<l;i++) {
			int end = i + 1;
			int start = l - i;
			int subarray = end * start;
			
			int oddarray = (subarray + 1)/2;
			
			totalsum += arr[i] * oddarray;
		}
		return totalsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(sumOddLengthSubArray(arr));

	}

}
