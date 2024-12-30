package basic.programming.problems;

import java.util.*;
public class InversionCount {
	
	public static int count(int [] arr, int n) {
		int count = 0;
		int min = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i] > arr[j]) {
					min = arr[i];
					arr[i] = arr[j];
					arr[j] = min;
					count++;
				}
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		int [] arr = new int[n];

		for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
		}
		System.out.println(count(arr,n));

	}

}
