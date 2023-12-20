package chapter13;

import java.util.Comparator;

public class Descend implements Comparator {


	@Override
	public int compare(Object o1, Object o2) {
		Comparable c1 = (Comparable) o1;
		Comparable c2 = (Comparable) o2;
		return c1.compareTo(c2) * (-1);  //역순으로 
	}

}



