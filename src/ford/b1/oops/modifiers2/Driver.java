package ford.b1.oops.modifiers2;

import ford.b1.oops.modifiers.A;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//public
		A a = new A();
		a.data=250;
		a.display();
		//private
		//a.name="Hello";
		//default
		//a.email="email";// its package protected.
		//protected
		//a.pin="4321";
	}

}
