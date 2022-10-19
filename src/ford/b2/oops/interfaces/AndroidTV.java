package ford.b2.oops.interfaces;

public class AndroidTV extends ColorTv implements SmartTV,WiFi{

	@Override
	public void display() {
		System.out.println("Android display");
		
	}

	@Override
	public void voiceCommand() {
		System.out.println("Listening to your voice !");
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

}
