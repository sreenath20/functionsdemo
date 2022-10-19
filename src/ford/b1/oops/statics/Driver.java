package ford.b1.oops.statics;

public class Driver {

	public static void main(String[] args) {
		//System.out.println(A.data);
		A.display();
		
		A a1=new A();
		A a2 = new A();
		
		a1.incrementData();
		a2.displayData();
		

	}

}
