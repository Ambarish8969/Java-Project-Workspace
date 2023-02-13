package defaultSorting;

// comparable interface is present in java.lang package 
// which is not required to import

public class Hotel implements Comparable<Hotel> {
	String name;
	Double ratings;
	
	Hotel(String name,double ratings){
		this.name=name;
		this.ratings=ratings;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", ratings=" + ratings + "]";
	}
	
	@Override
	public int compareTo(Hotel h) {
//		return (int) (this.ratings-h.ratings);
		return this.ratings.compareTo(h.ratings);
	}
}

// this -> object to be inserted h -> already existing object

// To compare String objects and Double object we are taking the help
// of compareTo() of String class and compareTo() Double class

// 				1. String comparison -> name
// 			Ascending order -> return this.name.compareTo(h.name);
// 			Descending order -> return h.name.compareTo(this.name);

// 				2. Double comparison -> ratings
// 			Ascending order -> return this.ratings.compareTo(h.ratings);
// 			Descending order -> return h.ratings.compareTo(this.ratings);