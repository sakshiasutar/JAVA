package basic.programming.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductSmallesstPairOne {
	
	public static int product(int [] arr,int n, int sum) {
		int output=0;
		
		if(n<2) {
			return -1;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(arr[i]);
		}
		
		Collections.sort(list);
		
		int res = list.get(0) + list.get(1);
		
		if (res < sum) {
			output = list.get(0) * list.get(1);
		}
		return output;
	}
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    
	    System.out.println(product(arr,n,sum));
	}
}
