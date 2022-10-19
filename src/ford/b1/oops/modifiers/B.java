package ford.b1.oops.modifiers;

// cant sub class a final class A
//public class B extends A{
public class B extends A{
	
	public void callParentDisplay() {
		//public
		super.data=200;
		super.display();
		//private
		//super.name="Hello";
		//super.displayName();
		//default
		super.email="email!";
		//protected
		super.pin="4321";
		
	}
	// not possible to override final method
//	public final void function() {
//		
//	}
	

}
