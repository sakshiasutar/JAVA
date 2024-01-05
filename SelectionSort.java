package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of the array:");
    	int size = sc.nextInt();
    	int[] arr = new int[size];
    	for(int i=0;i<size;i++) {
    		arr[i] = sc.nextInt();    	
        }
    	
    	System.out.println(" " + Arrays.toString(arr));
    	selection(arr);
    	System.out.println(Arrays.toString(arr));
	}
	
    static void selection(int[] arr) {
    	for(int i=0;i<arr.length;i++) {
    		int last = arr.length-i-1;
    		int maxIndex = getMaxIndex(arr,0,last);
    		swap(arr,maxIndex,last);
    	}
    }
    
    static void swap(int[] arr,int first, int second) {
    	int temp = arr[first];
    	arr[first] = arr[second];
    	arr[second] = temp;
    }
    
    static int getMaxIndex(int[] arr,int start, int end) {
    	int max = start;
    	for(int i=start;i<=end;i++) {
    		if(arr[max] < arr[i]) {
    			max = i;
    		}
    	}
    	return max;
    }
    	
}
