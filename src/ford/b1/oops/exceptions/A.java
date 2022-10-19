package ford.b1.oops.exceptions;

public class A {
	public void fun1() {
		try {
			fun2();
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public void fun2() {
		int i = 10/0;
	}

}
