package ford.b1.oops.inheritance;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Parent parent;
		parent = new Parent();
		parent.display();

		Child child = new Child();
		child.display();
		child.display2();
		
		child=(Child)parent;
		

		// parent ref
		Parent parentRef;
		parentRef = child;
		// child display
		System.out.println("calling child display");
		parentRef.display();
		System.out.println("calling parent display");
		parentRef = parent;
		parentRef.display();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1:Parent 2:Child");
		int choice = scanner.nextInt();
		if (choice == 1) {
			parentRef = parent;
		} else {
			parentRef = child;
		}
		parentRef.display();
		
		int intData=100;
		double doubleData = intData;// no data loss
		intData = (int) doubleData;// data loss
		parent=child;
		child = (Child) parent;
		child.display();
		

	}

}
