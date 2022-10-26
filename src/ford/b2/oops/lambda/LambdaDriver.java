package ford.b2.oops.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDriver {

	public static void main(String[] args) {
		
		Demo demo = (n) -> n * n;

		System.out.println(demo.fun(5));
		// Built in Functional interfaces

		// Supplier :get()
		Supplier<String> companyName = () -> "Ford";
		System.out.println(companyName.get());
		Supplier<Employee> empSupplier = () -> new Employee(1, "Ford ", 15000.0);
		System.out.println(empSupplier.get());
		// Consumer:accept()
		Consumer<Double> doubleConsumer = (d) -> System.out.println(d);
		doubleConsumer.accept(4500.0);
		Consumer<Employee> employeeConsumer = (e) -> System.out.println(e);
		employeeConsumer.accept(new Employee(1, "Ford ", 15000.0));
		// Function:appply()
		Function<String, Integer> stringFunction = (str) -> str.length();
		System.out.println(stringFunction.apply("Ford"));

		Function<String, Integer> stringFunction2 = (str) -> {

			return str.length();
		};
		System.out.println(stringFunction2.apply("Ford"));
		// write a lambda square a number
		Function<Integer, Integer> sqr = (n) -> n * n;
		System.out.println(sqr.apply(5));
		Function<Employee,String> getEmployeeName = (e)->e.getName();
		System.out.println(getEmployeeName.apply(new Employee(1, "Sreenath", 1000.0)));
		// hike the sal by 10%
		Function<Employee, Employee> salaryHike = (e)->{
			e.setSalary(e.getSalary()*1.1);
			return e;
		};
		
		System.out.println(salaryHike.apply(new Employee(1, "Sreenath", 1000.0)));
		
		//Pridicate:test()
		Predicate<Integer> isEven = (n)->((n%2)==0);
		System.out.println(isEven.test(7));
		// write a predicate to check salary > 1000/-
		Predicate<Employee> checkSalary = (e)->e.getSalary()>1000.0;
		System.out.println("is emp sal > 1000?:"+checkSalary.test(new Employee(1, "AA", 500.0)));
		
		
	}

}
