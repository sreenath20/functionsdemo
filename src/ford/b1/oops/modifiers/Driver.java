package ford.b1.oops.modifiers;

public class Driver {

	public static void main(String[] args) {
		A a = new A();
		
		System.out.println("data:"+a.data);
		a.display();
		//private
		//a.name="Hello";
		//default
		a.email="Sree@gmail.com";
		a.displayEmail();
		//protected
		a.pin="4321";
		
		
		B b = new B();
		b.callParentDisplay();
		
		
		
	}

}
