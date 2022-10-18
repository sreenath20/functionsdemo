package ford.b1.oops.abstraction;

public class Driver {

	public static void main(String[] args) {
		
		Parent parent;
		parent = new Child();//new Parent();

		parent.function();
		parent.display();
	}

}
