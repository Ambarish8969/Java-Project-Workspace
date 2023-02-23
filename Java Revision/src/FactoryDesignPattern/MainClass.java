package FactoryDesignPattern;

public class MainClass {
	public static void main(String[] args) {
		Hotel h1=new Hotel();
		Food obj=h1.orderFood(1);
		System.out.println(obj);
	}
}
/** Factory DesignPattern:
 * 1 methods returning different types of objects by having generalized returntype.
 */
