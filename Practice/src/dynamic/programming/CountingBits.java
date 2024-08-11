package dynamic.programming;

import java.util.*;

public class CountingBits {
	
	public static int[] countBits(int n){
		int [] ans = new int[n+1];
		for(int i=0;i<=n;i++) {
			if(i==0) {
				ans[0] = 0;
			}
			
			ans[i] = (ans[i>>1]) + (i&1);
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		
		int [] results = countBits(n);
		
		for(int i=0;i<results.length;i++) {
			System.out.print(results[i] + " "); 
		}
		System.out.println();
	}

}
