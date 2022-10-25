package ford.b1.oops.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import ford.b1.oops.collection.comparable.Employee;

public class Driver {

	public static void main(String[] args) {

		// DemoInterface demo = ()->System.out.println("Hello Ford");

		// demo.display();
		// DemoInterface demo = (s)->System.out.println(s);
		// demo.display("Ford demo !");
		DemoInterface demo = (s) -> s.length();
		System.out.println(demo.displaySize("FORD"));
		// Built in Function Interfaces
		// Consumer
		Consumer<Integer> intConsumber = (i) -> System.out.println(i);
		intConsumber.accept(100);
		Consumer<Double> doubleConsumber = (d) -> System.out.println(d);
		doubleConsumber.accept(100.0);
		Consumer<String> stringConsumber = (s) -> System.out.println(s);
		stringConsumber.accept("Ford");
		Consumer<Employee> employeeConsumer = (e) -> System.out.println(e);
		employeeConsumer.accept(new Employee(1, "Ford", 25000.0));
		// Supplier
		Supplier<Integer> intSupplier = () -> 5000;
		System.out.println(intSupplier.get());
		Supplier<String> stringSupplier = () -> "Ford India";
		System.out.println(stringSupplier.get());

		Supplier<Employee> empSupplier = () -> new Employee(2, "Vishal", 15000.0);
		System.out.println(empSupplier.get());
		// Function
		Function<String, Integer> stringFunction = (s) -> s.length();

		System.out.println(stringFunction.apply("India"));

		Function<Integer, Integer> square = (d) -> d * d;
		/*
		 * Integer square(Integer d){ return d*d; }
		 * 
		 */
		System.out.println(square.apply(5));
		Function<Integer, Boolean> oddOrEven = (d) -> ((d % 2) == 0);
		System.out.println("7 is Even:" + oddOrEven.apply(7));

		Function<Employee, Employee> salaryHike = (e) -> {
			e.setSalary(e.getSalary() * 1.1);
			return e;
		};

		System.out.println(salaryHike.apply(new Employee(2, "Vishal", 15000.0)));

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1, "BB", 300.0));
		empList.add(new Employee(5, "EE", 150.0));
		empList.add(new Employee(2, "DD", 500.0));
		empList.add(new Employee(3, "AA", 200.0));

		Function<List<Employee>, List<Employee>> hikeAllEmpSal = (employeeList) -> {

			for (Employee emp : employeeList) {
				emp.setSalary(emp.getSalary() * 1.1);
			}
			return employeeList;
		};
		System.out.println(hikeAllEmpSal.apply(empList));
	
	// Predicate
		Predicate<Integer> even = (d)->((d%2)==0);
		System.out.println(even.test(101));
		
	}

}
