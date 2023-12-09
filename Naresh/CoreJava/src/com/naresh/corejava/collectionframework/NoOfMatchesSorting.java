package com.naresh.corejava.collectionframework;

import java.util.Comparator;

public class NoOfMatchesSorting implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer c1, Cricketer c2) {
		
		return c1.getNoOfMatches().compareTo(c2.getNoOfMatches());
	}

}
