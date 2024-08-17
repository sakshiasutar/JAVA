package basic.programming.problems;

import java.util.*;
public class MInimumSumOfFourDigitNumAfterSplittingDigits{

public static int sumMin(int num){
String s = Integer.toString(num);
char[] digits = s.toCharArray();

Arrays.sort(digits);
String s1 = "" + digits[0] + digits[2];
String s2 = "" + digits[1] + digits[3];

int num1 = Integer.parseInt(s1);
int num2 = Integer.parseInt(s2);

return num1 + num2;

}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter he 4 digit value:");
int num = sc.nextInt();

System.out.println(sumMin(num));
}
}
