package sorting.algos;
import java.util.*;

public class SelectionSort {
	 
	void sort(int arr[]) {
		int l = arr.length;
		for(int i=0;i<l-1;i++) {
			int min = i;
			for(int j=i+1;j<l;j++) {
				if(arr[j] < arr[min]) {
					min = j ;
				}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			}
		}
	}
	

	void printArray(int arr[]) {
		int l = arr.length;
		for(int i=0;i<l;i++) {
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
    	
    	System.out.println("Array Before Selection sort:");
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	
    	SelectionSort ob = new SelectionSort();
    	ob.sort(arr);
    	System.out.println("Array After Selection Sort:");
    	ob.printArray(arr);
    	
    }
}
