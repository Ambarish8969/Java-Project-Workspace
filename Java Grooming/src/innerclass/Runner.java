package innerclass;

@FunctionalInterface
interface Amazon{
	void purchase(String product);
}
class Customer implements Amazon{
	@Override
	public void purchase(String product) {
		System.out.println("Purchasing : "+product);
	}
}
public class Runner {
	public static void main(String[] args) {
		// By having explicit implementation class.
		Customer c1=new Customer();
		c1.purchase("Mobile");
		
		// By having Anonymous Inner class.
		Amazon a1= new Amazon() {
			@Override
			public void purchase(String product) {
				System.out.println("Purchasing : "+product);
			}
		};
		a1.purchase("Laptop");
		
		// By having LambdaExpression.
		Amazon a2 = (product) -> {
			System.out.println("Purchasing : "+product);
		};
		a2.purchase("Bike");
	}
}
