package ford.b2.oops.interfaces;

import ford.b2.oops.Employee;

public class Driver {

	public static void main(String[] args) {
		
		
		Tv tv;//=new A();
		tv = new BlackAndWhite();		
		tv.display();
		
		tv = new ColorTv();
		tv.display();
		// tight coupling
		//Employee employee = new Employee();
		SmartTV sony = new AndroidTV();
		sony.display();
		sony.voiceCommand();
		
		tv = new AndroidTV();
		tv.display();
		//tv.voiceCommand(); // implementation is abstracted
		
		
	}

}
