package list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//add elements
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		//get elements
		int element = list.get(0);
		System.out.println(element);

		//add element in between
		list.add(1,40);
		System.out.println(list);

		// set element
		list.set(0,50);
		System.out.println(list);

		//delete element
		list.remove(3);
		System.out.println(list);

		// size of array
		int size = list.size();
		System.out.println(size);
		
		// loops
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();

		// sorting
		Collections.sort(list);
		System.out.println(list);
		
	}

}
