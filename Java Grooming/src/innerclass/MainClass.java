package innerclass;

interface Calculator{
	void add(int a,int b);
	void mul(int a,int b);
}
public class MainClass {
	public static void main(String[] args) {
		Calculator c1=new Calculator() {
			@Override
			public void add(int a,int b) {
				System.out.println(a+b);
			}
			@Override
			public void mul(int a,int b) {
				System.out.println(a*b);
			}
		};
		c1.add(10, 20);
		c1.mul(15, 2);
	}
}
