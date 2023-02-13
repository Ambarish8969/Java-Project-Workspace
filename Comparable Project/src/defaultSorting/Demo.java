package defaultSorting;

public class Demo {
	public static void main(String[] args) {
		String x="A";
		String y="B";
		System.out.println(x.compareTo(y)); // "A".compareTo("B") -> -1
		System.out.println(y.compareTo(y)); // "B".compareTo("B") -> 0
		System.out.println(y.compareTo(x)); // "B".compareTo("A") -> 1
		
		System.out.println("----------------------------");
		
		Double a=1.5; // Integer a=10;
		Double b=2.5; // Integer b=20;
		System.out.println(a.compareTo(b)); // -1
		System.out.println(b.compareTo(a)); // +1
		System.out.println(b.compareTo(b)); // 0
	}
}
