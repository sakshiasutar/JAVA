package basic.programming.problems;

import java.util.*;
public class XorOperationInAnArray{

public static int xorOperation(int n, int start){
int result = 0;
for(int i=0;i<n;i++){
result ^= start + 2 * i;
}
return result;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n:");
int n = sc.nextInt();

System.out.println("Enter the value from where to start:");
int start = sc.nextInt();

System.out.println(xorOperation(n,start));
}
}
