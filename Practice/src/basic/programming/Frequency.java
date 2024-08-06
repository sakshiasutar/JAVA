package basic.programming;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arr:");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter the elements in the arr:");
		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		
		int[] fr = new int[arr1.length];
		int visited = -1;
		for(int i=0;i<arr1.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i] == arr1[j]) {
					count++;
					fr[j] = visited;
				}
			}
			if(fr[i] != visited) {
				fr[i] = count;
			}
		}
		System.out.println("Frequency");
		for(int i=0;i<fr.length;i++) {
			if(fr[i] != visited) {
			System.out.println(" "+ arr1[i]+ " " + fr[i]);
			}
		}
	}
}
