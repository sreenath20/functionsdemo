package ford.b1.oops.interfaces;

public class ColorTv implements Tv{

	@Override
	public void display() {
		System.out.println("color display");
	}

	@Override
	public void switchOn() {
		System.out.println("Power On");
	}

	
}
