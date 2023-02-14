package defaultSorting;

public class Car implements Comparable<Car>{
	int cost;

	public Car(int cost)
	{
		this.cost=cost;
	}

	@Override
	public String toString() {
		return "Car [cost = " + cost + "]";
	}
	
	@Override
	public int compareTo(Car c) {
		return this.cost-c.cost;
	}
}

// this. -> object to be inserted (current object) c -> already existing object
// <<Coparable>> -> PDI, java.lang, JDK1.2
// 1. Class should implement comparable interface.
// 2. Specify Generic.
// 3. Override compareTo() -> public int compareTo(Element e);