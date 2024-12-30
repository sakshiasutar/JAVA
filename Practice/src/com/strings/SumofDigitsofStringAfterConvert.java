/*Input: s = "leetcode", k = 2

Output: 6

Explanation:

The operations are as follows:
- Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
- Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
- Transform #2: 33 ➝ 3 + 3 ➝ 6
Thus the resulting integer is 6.*/

package com.strings;
import java.util.*;

public class SumofDigitsofStringAfterConvert {
	
	public static int sumofDigit(String s, int k) {
		StringBuilder sb = new  StringBuilder();
		char[] charArray = s.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			char ch = charArray[i];
			int position = ch - 96;
			sb.append(position);
			
		}
		while(k>0) {
			int sum = 0;
			for(int i=0;i<sb.length();i++) {
				sum += (sb.charAt(i) - '0');
			}
			k--;
			sb = new StringBuilder(String.valueOf(sum));
		}
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		System.out.println("Enter the value of k :");
		int k = sc.nextInt();
		System.out.println(sumofDigit(s,k));
	}
}
