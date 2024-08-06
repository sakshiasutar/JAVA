package basic.programming;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutation {
	
	public static int[] buildArray(int [] arr) {
		int n = arr.length;
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = arr[arr[i]];
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
		int[] res = buildArray(arr);
		
		System.out.println(Arrays.toString(res));
    }
}
