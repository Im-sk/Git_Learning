package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcatList {

	public static void main(String[] args) {
		// 
		
		List<Integer> l1 =  new ArrayList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		List<Integer> l2 =  new ArrayList<>();
		l2.add(5);
		l2.add(6);
		l2.add(7);
		l2.add(8);
		
		List<Integer> l3 =  new ArrayList<>();
		
		l3.addAll(l1);
		l3.addAll(l2);
		
//		System.out.println(l3);
		
		Iterator it = l3.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
