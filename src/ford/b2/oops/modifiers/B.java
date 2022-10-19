package ford.b2.oops.modifiers;

public class B extends A{

	public void displayFun() {
	super.name="Ford B";
	//super.email="email";
	super.address="address";
	super.pin="123";
		
	}
	//cant override final parent method
//	public final void displayData() {
//		System.out.println(data);
//	}
}
