package sorting.algos;

import java.util.Scanner;

public class InsertionSort {
	
	void sort(int arr[]) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Size of array:");
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	
    	System.out.println("Enter the elements in array:");
    	for(int i=0;i<arr.length;i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	System.out.println("Array Before Insertion sort:");
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	
    	InsertionSort ob = new InsertionSort();
    	ob.sort(arr);
    	System.out.println("Array After Insertion Sort:");
    	printArray(arr);
		
	}

}
