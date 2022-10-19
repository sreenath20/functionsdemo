package ford.b2.oops.modifiers;

public class Driver {

	public static void main(String[] args) {
		//public
		A a = new A();
		a.name="New Ford";
		System.out.println(a.name);
		a.display();
//		//private
//		a.email="new";
//		a.display2();
		//default
		a.address="new";
		a.display3();
		//protected
		a.pin="123";
		a.display4();
	}

}
