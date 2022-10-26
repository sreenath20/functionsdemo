package ford.b2.oops.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import ford.b2.oops.lambda.Employee;

public class StreamDriver {

	public static void main(String[] args) {
		// Map
		List<String> nameList = new ArrayList<>();
		nameList.add("Moulika");
		nameList.add("Chandana");
		nameList.add("Abinaya");
		nameList.add("Iswarya");
		nameList.add("Kamal");
		nameList.add("Giri");
		nameList.add("Phanindra");

		// to convert all names to upper case
		nameList.stream().map((n) -> n.toUpperCase()).forEach((n) -> System.out.println(n));
		System.out.println("emp data soure:" + nameList);
		// find length of names
		nameList.stream().map((n) -> n.length()).forEach((n) -> System.out.println(n));
		List<Integer> lengthList = nameList.stream().map((n) -> n.length()).collect(Collectors.toList());
		System.out.println(lengthList);
		// Filter
		// get numbers <=7
		lengthList.stream().filter((n) -> n <= 7).forEach((n) -> System.out.println(n));
		// get names having len >=7
		nameList.stream().filter((n) -> n.length() < 7).forEach((n) -> System.out.println(n));
		// Reduce
		Optional<Integer> optResult = nameList.stream().map((n) -> n.length()).reduce((n1, n2) -> n1 + n2);
		if (optResult.isPresent())
			System.out.println(optResult.get());
		// Sorted
		nameList.stream().sorted().forEach((n) -> System.out.println(n));

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(5, "DD", 5000.0));
		empList.add(new Employee(1, "FF", 3000.0));
		empList.add(new Employee(7, "JJ", 1000.0));
		empList.add(new Employee(3, "EE", 2000.0));
		System.out.println("emp data source:"+empList);
		// increase emp by 10%
		List<Employee> salaryHikedEmployees = empList.stream().map((e) -> {
			e.setSalary(e.getSalary() * 1.1);
			return e;
		}

		).collect(Collectors.toList());
		
		System.out.println("Salary Hiked emps:"+salaryHikedEmployees);
		System.out.println("emp data source:"+empList);
		// Find the sum of all salaries?
		Optional<Double> optSalarySum = empList.stream().map((e)->e.getSalary()).reduce((s1,s2)->s1+s2);
		if(optSalarySum.isPresent())System.out.println("Total sal="+optSalarySum.get());
		//sort emp by name
		empList.stream().sorted().forEach((e)->System.out.println(e));
		System.out.println(empList);
		//sort emp by salary
		empList.stream().sorted((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).forEach((e)->System.out.println(e));
		//limit
		System.out.println("limit 2 emps:");
		empList.stream().limit(2).forEach((e)->System.out.println(e));
		//skip
		System.out.println("skip first 2 emps:");
		empList.stream().skip(2).forEach((e)->System.out.println(e));
		
	}

}
