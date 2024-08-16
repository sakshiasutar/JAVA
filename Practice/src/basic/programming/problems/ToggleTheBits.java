package basic.programming.problems;

import java.util.*;

public class ToggleTheBits {
	
	public static int toggleBits(int n) {
		int numbits = Integer.toBinaryString(n).length();
		
		int bits = (1<<numbits) - 1;
		
		int result = n ^ bits;
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();

		System.out.println(toggleBits(n));
	}

}
