package ford.b1.oops.modifiers;

//public final class A {
public class A {
	public Integer data = 100;
	private String name = "Ford";
	String email="sree@ford.com";
	protected String pin="1234";
	
	public final Integer number ;
	

	public A() {
		super();
		number=200;
		//number=300;
	}
	
	
	public void display() {
		System.out.println("data:" + data);
		//number=200;
	}
	private void displayName() {
		System.out.println("Name:" + name);
	}
	public void displayEmail() {
		System.out.println("Email:" + email);
	}
	public final void function() {
		System.out.println("Am final function.");
	}

}
