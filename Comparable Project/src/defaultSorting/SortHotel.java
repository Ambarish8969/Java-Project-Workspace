package defaultSorting;

import java.util.TreeSet;

public class SortHotel {
	public static void main(String[] args) {
		Hotel h1=new Hotel("oyo", 5.0);
		Hotel h2=new Hotel("taj",4.7);
		Hotel h3=new Hotel("ganesh",3.0);
		
		TreeSet<Hotel> t1=new TreeSet<Hotel>();
		t1.add(h1);
		t1.add(h2);
		t1.add(h3);
		
		for(Hotel i:t1) {
			System.out.println(i);
		}
	}
}
