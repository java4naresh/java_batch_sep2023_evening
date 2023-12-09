package com.naresh.corejava.collectionframework;

import java.util.Comparator;

public class CricketerAgeSorting implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer c1, Cricketer c2) {
		
		return c1.getAge().compareTo(c2.getAge());
	}

}
