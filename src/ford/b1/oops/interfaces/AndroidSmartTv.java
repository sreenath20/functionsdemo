package ford.b1.oops.interfaces;

public class AndroidSmartTv implements SmartTv{

	@Override
	public void display() {
		System.out.println("Android color display");
		
	}

	@Override
	public void switchOn() {
		System.out.println("Switchin Android on");
		
	}

	@Override
	public void voiceCommand() {
		System.out.println("Android listening to you!");
		
	}

}
