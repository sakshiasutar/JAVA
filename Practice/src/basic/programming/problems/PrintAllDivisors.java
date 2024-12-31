package basic.programming.problems;

import java.util.*;
import java.util.ArrayList;


public class PrintAllDivisors {
	
	public static ArrayList<Integer> findDivisor(int n){
		ArrayList<Integer> divisor = new ArrayList<Integer>();
		
		int res = (int) Math.sqrt(n);
		
		for(int i=1;i<=res;i++) {
			if(n%i == 0) {
				divisor.add(i);
				
				if(i!=n/i) {
					divisor.add(n/i);
				}
			}
		}
		
		return divisor;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> divisor = findDivisor(n);
		Collections.sort(divisor);
		
		for(int i=0;i<divisor.size();i++) {
			System.out.print(divisor.get(i));
			if(i<divisor.size()-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		
	}
}
