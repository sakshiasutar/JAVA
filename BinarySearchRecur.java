package Recursion;
import java.util.*;


public class BinarySearch {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of the array:");
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	for(int i=0;i<n;i++) {
    		System.out.println("Enter the elements in array:");
    		arr[i] = sc.nextInt();
    		
    	}
    	
    	System.out.println("Enter the target you want to search");
    	int target = sc.nextInt();
    	
    	int result = binary(target,arr,0,arr.length-1);
    	System.out.println(result);
    	
 
    }
    
    public static int binary(int target, int[] arr, int s, int e) {
    	if(s>e) {
    		return -1;
    	}
    	
    	int m = s+(e-s)/2;
    	if(arr[m] == target) {
    		return m;
    	}
    	
    	if(target< arr[m]) {
    		return binary(target,arr,s,m-1);
    	}
    	
    	return binary(target,arr,m+1,e);
    }
}
