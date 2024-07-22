package list.arraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(12);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(12);
		
		System.out.println("Before " + list);
		
		Set<Integer> set = new LinkedHashSet<>(list);
		list.clear();
		
		list.addAll(set);
		System.out.println("After " + list);
	}
}
