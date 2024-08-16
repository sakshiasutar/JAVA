//Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

//Note : 1st element of the array should be considered in the count of the result.

package basic.programming.problems;

import java.util.*;
public class CountElements{

public static int count(int [] arr){
int count = 1;
int max = arr[0];
for(int i=1;i<arr.length;i++){
if(max < arr[i]){
count++;
}
}
return count;
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
		
		System.out.println("The count is : ");
		System.out.println(count(arr));
}
}
