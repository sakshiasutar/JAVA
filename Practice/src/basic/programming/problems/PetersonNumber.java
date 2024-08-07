package basic.programming.problems;

import java.util.*;

public class PetersonNumber {
	
	public static void factsum(int n) {
		int original = n;
		int rem, res =0;
		while(n > 0) {
			rem = n%10;
			int fact = 1;
			for(int i=2;i<=rem;i++) {
				fact = fact * i;
			}
			res = res + fact;
			n = n/10;
			
		}
		if(res == original) {
			System.out.println("It is a peterson number");
			}
		else {
			System.out.println("It is not a peterson number");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Numner:");
		int n = sc.nextInt();
		
		factsum(n);
	}
	
}
