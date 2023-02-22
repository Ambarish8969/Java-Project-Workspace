package lambdaexpressions;

@FunctionalInterface
interface Mobile{
	void display(String brand,int cost);
}

public class Tom {
	public static void main(String[] args) {
		// Anonymous inner class with reference variable.
		Mobile m1= new Mobile() {
			@Override
			public void display(String brand,int cost) {
				System.out.println("Brand : "+brand+" cost : "+cost);
			}
		};
		m1.display("Samsung",13000);
		
		new Mobile() {
			@Override
			public void display(String brand, int cost) {
				System.out.println("Brand : "+brand+" cost : "+cost);
			}
		}.display("Nokia", 15000);
		
		Mobile m2= (brand,cost) -> {
			System.out.println("Brand : "+brand+" cost : "+cost);
		};
		m2.display("Motog", 16000);
		
		Mobile m3=(brand , cost) -> System.out.println("Brand : "+brand+" cost : "+cost);
		m3.display("Poco", 17000);
		
	}
}
