package ford.b1.oops.interfaces;

public class BlackAndWhiteTv implements Tv {

	@Override
	public void display() {
		System.out.println("Display B&W");
		
	}

	@Override
	public void switchOn() {
		System.out.println("Switch Tv on");
	}

}
