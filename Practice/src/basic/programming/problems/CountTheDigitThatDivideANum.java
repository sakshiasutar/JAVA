package basic.programming.problems;

import java.util.*;
public class CountTheDigitThatDivideANum{

public static int countTheDigitThatDivideANum(int n){
String s = Integer.toString(n);
char [] digits = s.toCharArray();
int count = 0;

for(int i=0;i<s.length();i++){
int digit = digits[i] - '0';
if(digit != 0 && n%digit == 0){
count++;
}
}
return count;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value:");
int n = sc.nextInt();

System.out.println(countTheDigitThatDivideANum(n));

}
}