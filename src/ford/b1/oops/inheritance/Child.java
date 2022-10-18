package ford.b1.oops.inheritance;

public class Child extends Parent { // child

	public Child() {
		super();

	}

	// replace existing functionality
	public void display() {
		System.out.println("Child Display ");
	}

	// add new functionality
	public void display2() {
		System.out.println("Display2 B");
	}

}
