//A defanged IP address replaces every period "." with "[.]".

package basic.programming.problems;

import java.util.*;

public class DefangingAnIpAddress {
	
	public String defange(String n) {
		StringBuilder defang = new StringBuilder();
		for(int i=0;i<n.length();i++) {
			char c = n.charAt(i);
			if(c == '.') {
				defang.append("[.]");
			}
			else {
				defang.append(c);
			}
		}
		return defang.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String n = sc.nextLine();
		
		DefangingAnIpAddress obj = new DefangingAnIpAddress();
		String res = obj.defange(n);
		System.out.println(res);
		
	}

}
