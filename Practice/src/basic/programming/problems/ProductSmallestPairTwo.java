package basic.programming.problems;

import java.util.*;

public class ProductSmallestPairTwo {

	public static int productOne(int[] arr, int n, int sum) {
		
		int temp;
		
		if(n<2) {
			return -1;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int res = arr[0] + arr[1];
		
		if(res<= sum) {
			return arr[0] * arr[1];
		}
		else {
			return 0;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int sum = sc.nextInt();
         int n = sc.nextInt();
         int[] arr = new int[n];
         
         for(int i=0;i<n;i++) {
        	 arr[i] = sc.nextInt();
         }
         
         System.out.println(productOne(arr,n,sum));
	}

}
