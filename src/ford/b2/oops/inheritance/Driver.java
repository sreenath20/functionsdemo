package ford.b2.oops.inheritance;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Parent parent =new Parent();
		
		parent.function();
		Child child =  new Child();
		//child.name="hi";
		child.function2();
		
		Parent parentRef;
		parentRef =parent;
		
		parentRef.function();
		parentRef.function(10);
		parentRef=child;
		
		parentRef.function();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1:Parent 2:Child");
		int choice=scanner.nextInt();
		Child childRef;
		
		if(choice==1) {
			parentRef=parent;
			//childRef=parent;
		}
		else
		{
			parentRef=child;
			
		}
		
		parentRef.function();

	}

}
