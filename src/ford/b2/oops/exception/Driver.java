package ford.b2.oops.exception;

public class Driver {

	public static void main(String[] args) {

		
//		try {
//			int i = 10 / 0;
//			System.out.println(i);
//		} catch (ArithmeticException e) {// exception logic
//			System.out.println(e.getMessage());
//		}
		
		try { // business logic

			try {
//				int i = 10 / 0;
//				System.out.println(i);
			} catch (ArithmeticException e) {// exception logic
				System.out.println(e.getMessage());
			}
//		int i = 10/0;
//		System.out.println(i);
//		String name=null;
//		name.length();
//			int arr[]= {1,2,3};
//			System.out.println(arr[3]);

		} catch (ArithmeticException e) {// exception logic
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		catch (RuntimeException e) {
			System.out.println("Runtime Exception:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Runtime Exception:" + e.getMessage());
		}

		finally {
			System.out.println("Finally always gets executed !");
		}
		
		A a = new A();
		try {
		a.fun1();
		}catch (ArithmeticException e) {// exception logic
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of application.");
	}

}
