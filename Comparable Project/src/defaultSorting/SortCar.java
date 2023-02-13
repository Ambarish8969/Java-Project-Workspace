package defaultSorting;

import java.util.TreeSet;

public class SortCar {
	public static void main(String[] args) {
		Car c1=new Car(200);
		Car c2=new Car(300); 
		Car c3=new Car(100);
		
		TreeSet<Car> obj=new TreeSet<Car>();
		obj.add(c1);
		obj.add(c2);
		obj.add(c3);
		for(Car i:obj) {
			System.out.println(i);
		}
	}
}
