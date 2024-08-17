package basic.programming.problems;

import java.util.*;

public class StepsToReduceANumToZero{

public static int reduceToZero(int num){
int count = 0;
while(num>0){
if(num%2 == 0){
num = num/2;
}
else{
num = num - 1;
}
count++;
}
return count;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of num:");
int num = sc.nextInt();

System.out.println("Steps required to reduce a number to zero : ");
System.out.println(reduceToZero(num));
}
}
