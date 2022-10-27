package ford.b1.oops.generics;

import java.time.LocalDate;

public class GenericsDriver {

	public static void main(String[]args) {
		Demo demo=new Demo(777);
		System.out.println(demo);
		
		DemoGeneric<String> demoString = new DemoGeneric<>("Ford");
		System.out.println(demoString);
		
		DemoGeneric<Double> demoDouble = new DemoGeneric<>(555.0);
		System.out.println(demoDouble);
		
		DemoGeneric<Employee> demoEmployee = new DemoGeneric<>();
		demoEmployee.setData(new Employee(1, "Name", 25000.0, LocalDate.of(2022,10,1)));
		System.out.println(demoEmployee);
		
		GenericInterface<Integer> intObj = new GenericInterfaceImpl<>();
		
	}
}
