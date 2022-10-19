package ford.b2.oops.modifiers;

//public final class A {
public class A {
	// final data member
	public final Integer data;// =100;

	public A() {
		data = 100;
	}

	public A(int data) {
		this.data = data;
		// data=300;
	}

	public String name = "Ford";
	private String email = "info@ford.com";
	// default modifier /package protected
	String address = "India";
	protected String pin = "570";

	public final void displayData() {
		System.out.println(data);
	}

	public void displayData(int a) {
		System.out.println(data);
	}

	public void display() {
		// data=200;
		System.out.println(name + email + address + pin);
	}

	private void display2() {
		System.out.println(name + email + address + pin);
	}

	void display3() {
		System.out.println(name + email + address + pin);
	}

	protected void display4() {
		System.out.println(name + email + address + pin);
	}
}
