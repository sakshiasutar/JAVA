package basic.programming;

import java.util.*;

public class PerfectSquare {
	
	static boolean checkPerfectSquare(double n) {
		double sqrt = Math.sqrt(n);
		
		return ((sqrt - Math.floor(sqrt)) == 0);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		double n = sc.nextInt();
		
		if(checkPerfectSquare(n)) {
			System.out.println("The given number is perfect square");
		}
		else {
			System.out.println("The given number is not perfect square");
		}
	}

}
