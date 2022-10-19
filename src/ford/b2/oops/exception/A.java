package ford.b2.oops.exception;

public class A {
	public void fun1() {
		//fun2();
		 try {
		fun2();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	public void fun2() throws ArithmeticException {
		int i = 10 / 0;
	}

}
