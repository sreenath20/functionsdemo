package ford.b2.oops.modifiers2;

import ford.b2.oops.modifiers.A;

public class Driver {

	public static void main(String[] args) {
	
		final Double pi= 3.14;
		//pi=5.5;
		final A a;//=new A();/@2000
		a= new A(100);
		//a=new A();
		a.name="my name";
		a.name="your name";
		//a.data=300;
		
		a.name="hi";
		//a.email="email";
		//a.address="address";//outside package not accessible
		//a.pin="123";//not visible
	}

}
