package basic.programming.problems;

import java.util.Scanner;

public class Calculate {

	public static int cal(int m, int n) {
		int res = 0;
		for(int i=m;i<n;i++) {
			if(i%3 == 0 && i%5 == 0) {
				res = res + i;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(cal(m,n));
	}

}
