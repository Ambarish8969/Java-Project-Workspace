package association;

class Country{
	String name="India";
	State state=new State();
}
class State{
	String name="Karnataka";
	District district=new District();
	
}
class District{
	String name="Belagavi";
	
}
public class MainClass {
	public static void main(String[] args) {
		Country country=new Country();
		System.out.println(country.name);
		System.out.println(country.state.name);
		System.out.println(country.state.district.name);
	}
}
