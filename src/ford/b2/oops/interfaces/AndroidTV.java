package ford.b2.oops.interfaces;

public class AndroidTV implements SmartTV{

	@Override
	public void display() {
		System.out.println("Android display");
		
	}

	@Override
	public void voiceCommand() {
		System.out.println("Listening to your voice !");
	}

}
