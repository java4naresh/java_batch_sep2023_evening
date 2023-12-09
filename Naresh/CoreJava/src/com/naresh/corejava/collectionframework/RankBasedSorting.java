package com.naresh.corejava.collectionframework;

import java.util.Comparator;

public class RankBasedSorting implements Comparator<Cricketer>{

	@Override
	public int compare(Cricketer c1, Cricketer c2) {
		
		return c1.getRank().compareTo(c2.getRank());
	}

}
