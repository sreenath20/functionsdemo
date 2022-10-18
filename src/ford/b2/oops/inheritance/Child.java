package ford.b2.oops.inheritance;

public class Child extends Parent{ // new version of customer requirement

	public Child() {
		super();//chaining of constructors.
		
	}
	// re implementing parent function
	public void function() {
		System.out.println("Child function");
	}
	// additional functionality
	public void function2() {
		System.out.println("Child function2");
	}
}
