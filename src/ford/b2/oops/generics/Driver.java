package ford.b2.oops.generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Driver {

	public static void main(String[] args) {
		
		Demo demo = new Demo(123);
		System.out.println(demo);

		DemoGeneric<String> stringDemo = new DemoGeneric<>("Ford");
		System.out.println(stringDemo);
		
		DemoGeneric<Double> doubleDemo = new DemoGeneric<>(123.5);
		System.out.println(doubleDemo);
		
		List<Integer> listInt = new ArrayList<>();
		listInt.add(5);listInt.add(15);listInt.add(6);
		DemoGeneric<List<Integer>> listDemo = new DemoGeneric<>(listInt);
		System.out.println(listDemo);
		
		DemoGeneric2<Integer, String> intString = new DemoGeneric2<>(5, "Ford");
		System.out.println(intString);
		
		DemoGeneric2<String, List<Integer>> stringList = new DemoGeneric2<>( "Ford",listInt);
		System.out.println(stringList);
		
		GenericDemoInterface<String> stringRef = new GenericDemoInterfaceImpl<>();
		stringRef.display("Ford");
		
		GenericDemoInterface<Employee> empRef = new GenericDemoInterfaceImpl<>();
		empRef.display(new Employee(6, "Ford", 25000.0, LocalDate.of(2022, 10, 10)));
		
		GenericDemoInterface<Integer> genericDisplayRef = new GenericDemoInterfaceImpl<>();
		genericDisplayRef.display(listInt);
		GenericDemoInterface<String> genericStringDisplayRef = new GenericDemoInterfaceImpl<>();
		List<String> listString = new ArrayList<>();
		listString.add("AA");listString.add("DD");listString.add("EE");
		genericStringDisplayRef.display(listString);
		
		// e.g of Upper bound
		DemoGeneric.display(new ArrayList<B>());
		DemoGeneric.display(new ArrayList<C>());
		//DemoGeneric.display(new ArrayList<A>()); // A is not of type B or its child
		//DemoGeneric.display(new ArrayList<Integer>());// Integer is not in A>B>C inheritance
		
		//e.g lower bound
		DemoGeneric.display2(new ArrayList<B>());
		DemoGeneric.display2(new ArrayList<A>());
		//DemoGeneric.display2(new ArrayList<C>());//coz its a child of B
		
	}

}
