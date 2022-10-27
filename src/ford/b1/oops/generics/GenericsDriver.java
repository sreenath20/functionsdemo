package ford.b1.oops.generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
		List<Integer> intList = new ArrayList<>();
		intList.add(3);intList.add(22);intList.add(5);
		System.out.println("Sum = "+DemoGeneric.sum(intList));
		//DemoGeneric.display(intList);
		List<String> strList = new ArrayList<>();
		strList.add("aaaa");strList.add("dddd");strList.add("yyyy");
		//DemoGeneric.display(strList);
		//DemoGeneric.sum(strList)
		//Upper bound
		//DemoGeneric.display(new ArrayList<A>() );
		DemoGeneric.display(new ArrayList<B>() );
		DemoGeneric.display(new ArrayList<C>() );
		// Lower bound
		//DemoGeneric.display2(new ArrayList<C>() );
		DemoGeneric.display2(new ArrayList<B>() );
		DemoGeneric.display2(new ArrayList<A>() );
		
		
		
	}
}
