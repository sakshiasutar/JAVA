package basic.programming.problems;

import java.util.*;

public class NumberOfCarries {

	public static int carries(int num1, int num2) {
		int count = 0;
		
		while(num1 != 0 && num2 != 0) {
		
		int n1 = num1 % 10;
		int n2 = num2 % 10;
		
		int n = n1 + n2 + count;
		
		if(n>9) {
			count = count + 1;
		}
		
		num1 = num1/10;
		num2 = num2/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(carries(num1, num2));
	}

}
