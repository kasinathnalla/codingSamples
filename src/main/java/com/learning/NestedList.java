package com.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NestedList {
	public static void main(String[] a) {
		
		
		List s = new ArrayList();
		s.add(1);
		s.add(List.of(2,3));
		s.add(List.of(List.of(List.of(4))));
		 getList(s);
		 System.out.println(sp);
	}

	private static List sp = new ArrayList();
	private static void getList(List a) {
		
		Iterator it = a.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			if(o instanceof Integer) {
				sp.add(o);
			}
			else {
				getList((List)o);
			}
			
		}
		
	}

}
