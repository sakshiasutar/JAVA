package basic.programming.problems;

import java.util.*;
public class RepeatTheSumRTimes{

public static int sum(int n, int r){
int sum =0;
for(int i=0;i<r;i++){
while(n>0){
int rem = n%10;
sum += rem;
n = n/10;
}

}
int res = 0;
while(sum>0){
int rem = sum%10;
res += rem;
sum = sum/10;
}
return res;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value :");
int n = sc.nextInt();

System.out.println("Enter the value of r:");
int r = sc.nextInt();

System.out.println(sum(n,r));
}
}
