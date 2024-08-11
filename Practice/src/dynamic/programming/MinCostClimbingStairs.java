package dynamic.programming;

import java.util.*;

public class MinCostClimbingStairs {
	
	public static int minCostClimbingStairs(int [] cost) {
		int n = cost.length;
		int [] dp = new int[n];
		dp[0] = cost[0];
		dp[1] = cost[1];
		
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return cost[0];
		}
		
		for(int i=2;i<n;i++) {
			dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
		}
		
		return Math.min(dp[n-1], dp[n-2]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int [] cost = new int[n];
		
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<n;i++) {
			cost[i] = sc.nextInt();
		}
		
		System.out.println(minCostClimbingStairs(cost));
	}

}
