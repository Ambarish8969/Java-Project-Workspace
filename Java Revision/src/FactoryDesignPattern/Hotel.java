package FactoryDesignPattern;

class Food{
	
}
class Biryani extends Food{
	@Override
	public String toString() {
		return "Eating Biryani";
	}
}
class CurdRice extends Food{
	@Override
	public String toString() {
		return "Eating CurdRice";
	}
}
class EggFriedRice extends Food{
	@Override
	public String toString() {
		return "Eating EggFriedRice";
	}
}
public class Hotel {
	public Food orderFood(int choice) {
		
		if(choice==1) {
			Biryani b=new Biryani();
			return b;
		}else if(choice==2) {
			CurdRice c=new CurdRice();
			return c;
		}else if(choice==3) {
			EggFriedRice e=new EggFriedRice();
			return e;
		}else {
			return null;
		}
	}
}
