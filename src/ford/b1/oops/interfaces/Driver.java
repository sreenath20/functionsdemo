package ford.b1.oops.interfaces;

public class Driver {

	public static void main(String[] args) {
		
		BlackAndWhiteTv sony = new BlackAndWhiteTv();
		sony.switchOn();
		sony.display();
		Tv tv;
		tv = new BlackAndWhiteTv();
		tv.display();
		tv = new ColorTv();
		tv.display();
		
		Tv lgTv = new AndroidSmartTv();
		lgTv.display();
		lgTv.switchOn();
		// abstraction of voiceCommand function
		//lgTv.voiceCommand();
		
		SmartTv lgSmartTv =new AndroidSmartTv(); ;
		lgSmartTv.voiceCommand();
	}

}
