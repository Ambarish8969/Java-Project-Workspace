package lambdaexpressions;

// Marker interface = Empty Interface(No abstract methods).
// Functional interface = Only One abstract method.

@FunctionalInterface
interface Employee{
	void work();
}
public class Solution {
	public static void main(String[] args) {
		Employee emp=() -> {
			System.out.println("Employee is Working.");
		};
		emp.work();
	}
}
