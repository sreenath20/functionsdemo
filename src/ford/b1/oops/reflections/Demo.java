package ford.b1.oops.reflections;

public class Demo {

	private String name;

	public Demo() {
		super();
	}

	public Demo(String name) {
		super();
		this.name = name;
	}
	
	public void display() {
		System.out.println("name:"+name);
		
	}
	
	public void display2(int value) {
		System.out.println("value:"+value);
		
	}
	private void display3() {
		System.out.println("Private method called.");
		
	}
	
}
