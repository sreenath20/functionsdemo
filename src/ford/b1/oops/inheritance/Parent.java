package ford.b1.oops.inheritance;

public class Parent extends Object{ // parent 
	private Integer value=200;
	public Integer data = 100;

	public Parent() {
		super();
	}
	public void display() {
		System.out.println("Parent Display "+data);
	}
//	public void display() {
//		System.out.println("Display A"+data);
//	}
	public void display3() {
		System.out.println("Parent Display "+data);
	}

}
