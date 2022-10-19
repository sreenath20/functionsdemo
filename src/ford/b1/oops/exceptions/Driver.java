package ford.b1.oops.exceptions;

import ford.b1.oops.Employee;

public class Driver {

	public static void main(String[] args) {

		// unchecked exceptions / runtime exception !
		try {
			// int i = 10 / 0;
			// System.out.println(i);

//			int arr[]= {1,2,3};
//			System.out.println(arr[3]);
			Employee employee = null;
			employee.getId();

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e.getMessage());
		} catch (NullPointerException e) {

			System.out.println("NullPointerException:" + e.getMessage());
		}

		catch (RuntimeException e) {

			System.out.println(e.getMessage());
		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally block will excute always.");
		}

		try {
			A a = new A();
			a.fun1();
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("My Application ends here...");
	}

}
