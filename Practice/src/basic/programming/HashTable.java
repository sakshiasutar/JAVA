package basic.programming;

import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> table = new Hashtable<>();
		table.put(1,"One");
		table.put(2,"Two");
		table.put(3,"Three");
		
		
	
		System.out.println("HashTable Elements: "+ table);
	
	}

}
