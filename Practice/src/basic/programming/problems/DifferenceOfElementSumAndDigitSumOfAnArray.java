package basic.programming.problems;

import java.util.*;
public class DifferenceOfElementSumAndDigitSumOfAnArray{

public static int differenceofSum(int [] arr){
int sum1 = 0; 
int sum2 = 0;
for(int i=0;i<arr.length;i++){
sum1 = sum1 + arr[i];
String s = Integer.toString(arr[i]);
for(int j=0;j<s.length();j++){
int digit = s.charAt(j) - '0';
sum2 = sum2 + digit;
}
}
return Math.abs(sum1 - sum2);
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n = sc.nextInt();
int [] arr = new int[n];

System.out.println("Enter the elements int the array:");
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}

System.out.println(differenceofSum(arr));
}
}