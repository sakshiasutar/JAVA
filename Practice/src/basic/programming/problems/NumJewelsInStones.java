//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

//Letters are case sensitive, so "a" is considered a different type of stone from "A".

package basic.programming.problems;

import java.util.*;


public class NumJewelsInStones {
	
	public static int numJewelsInStones(String jewels, String stones) {
		Set<Character> set = new HashSet<>();
		int count = 0;
		
		for(int i=0;i<jewels.length();i++) {
			char k = jewels.charAt(i);
			set.add(k);
		}
		
		for(int i=0;i<stones.length();i++) {
			char h = stones.charAt(i);
			if(set.contains(h)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String jewels = sc.nextLine();
		
		System.out.println("Enter the String2:");
		String stones = sc.nextLine();
		
		System.out.println(numJewelsInStones(jewels, stones));
		

	}

}
