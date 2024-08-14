package dynamic.programming;

import java.util.*;

public class UniquePath{

public static int uniquePath(int m,int n){
int [][] dp = new int[m][n];
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
dp[i][j] = -1;
}
}
return uniquePathOne(m-1,n-1,dp);
}

public static int uniquePathOne(int m, int n, int [][] dp){
if(m == 0 && n == 0){
return 1;
}

if(m < 0 || n < 0){
return 0;
}

if(dp[m][n] != -1){
return dp[m][n];
}

int up = uniquePathOne(m-1,n,dp);
int left = uniquePathOne(m,n-1,dp);

dp[m][n] = up+left;

return dp[m][n];

}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of m");
int m = sc.nextInt();

System.out.println("Enter the value of n");
int n = sc.nextInt();

System.out.println(uniquePath(m,n));
}
}
