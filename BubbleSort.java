package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of the array:");
    	int size = sc.nextInt();
    	int[] arr = new int[size];
    	for(int i=0;i<size;i++) {
    		arr[i] = sc.nextInt();    	
        }
    	
    	System.out.println(" " + Arrays.toString(arr));
    	bubble(arr);
    	System.out.println(Arrays.toString(arr));
    	
    }
    
    static void bubble(int[] arr) {
    	
    	for(int i=0;i<arr.length;i++) {
    		
    		for(int j=1;j<arr.length-i;j++) {
    			if(arr[j] < arr[j-1]) {
    			int temp = arr[j];
    			arr[j] = arr[j-1];
    			arr[j-1] = temp;
    			}
    		}
    	}
    	
    }
}
