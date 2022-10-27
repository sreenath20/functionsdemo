package ford.b1.oops.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDriver {

	public static void main(String[] args) {

		// Map
		List<String> namesList = new ArrayList<>();
		namesList.add("Supriya");
		namesList.add("Abhijith");
		namesList.add("Akshat");
		namesList.add("Aravinth");
		namesList.add("Hari");
		namesList.add("Pavan");
		// to find lenth of each name?
		namesList.stream().map((name) -> name.length()).forEach((len) -> System.out.println(len));
		// print all names in upper case?
		namesList.stream().map((name) -> name.toUpperCase()).forEach((upperName) -> System.out.println(upperName));
		// collect the processed data
		List<String> upperCaseNamesList = namesList.stream().map((name) -> name.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("uppecase names:" + upperCaseNamesList);

		// find all the names having length >=6
		namesList.stream().filter((name) -> name.length() >= 6).forEach((name) -> System.out.println(name));
		// print name length less than 6 chars
		namesList.stream().map((n) -> n.length()).filter((l) -> l < 6).forEach((l) -> System.out.println(l));

		// to find lenth of each name and sum it
		Optional<Integer> optTotalLength = namesList.stream().map((name) -> name.length()).reduce((a, b) -> a + b);
		if (optTotalLength.isPresent())
			System.out.println(optTotalLength.get());

		// print all e names in sorted order.
		namesList.stream().sorted((n1, n2) -> n1.compareTo(n2)).forEach((n) -> System.out.println(n));
		System.out.println(namesList);

		//
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1, "Abhijith", 30000.0, LocalDate.of(2022, 1, 1)));
		empList.add(new Employee(5, "Hari", 15000.0, LocalDate.of(2020, 5, 8)));
		empList.add(new Employee(2, "Akshat", 50000.0, LocalDate.of(2020, 5, 14)));
		empList.add(new Employee(3, "Pavan", 20000.0, LocalDate.of(2010, 2, 22)));
		System.out.println(empList);
		// print all emp names?
		empList.stream().map((e) -> e.getName()).forEach((n) -> System.out.println(n));
		// sort the emap by id
		empList.stream().sorted().forEach((e) -> System.out.println(e));
		List<Employee> sortedEmpList = empList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted emp list:" + sortedEmpList);
		// sort the emap by name

		List<Employee> sortedEmpListByname = empList.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		System.out.println("Sorted emp list by name:" + sortedEmpListByname);

		// sort emp by Date of joining.
		System.out.println("Emp list by DOJ:");
		empList.stream().sorted((e1, e2) -> e1.getDoj().compareTo(e2.getDoj())).forEach((e) -> System.out.println(e));

		// get list of emp getting sal more than 25000.
		Long count = empList.stream().filter((e) -> e.getSalary() > 25000).count();
		System.out.println("count of emp having sal > 25K:" + count);

		List<Employee> empSalaryList = empList.stream().filter((e) -> e.getSalary() > 25000)
				.collect(Collectors.toList());
		System.out.println("Emp having sal > 25k:" + empSalaryList);
		System.out.println("count of emp having sal > 25K:" + empSalaryList.size());

		System.out.println("Unchanged emp source:" + empList);

		// display / retrieve all emps who have joined company in the current year.
		System.out.println("Current year emp list:");
		LocalDate today = LocalDate.now();
		int currentYear = today.getYear();
		// empList.stream().filter((e)->e.getDoj().getYear()==currentYear).forEach(System.out::println);
		empList.stream().filter((e) -> e.getDoj().getYear() == LocalDate.now().getYear()).forEach(System.out::println);
		// Find 2 seniors in my company
		System.out.println("2 most seniors in the company:");
		int limitSize = 2;
		empList.stream().sorted((e1, e2) -> e1.getDoj().compareTo(e2.getDoj())).limit(limitSize)
				.forEach(System.out::println);

		System.out.println("2 most juniors in the company:");
		// int limitSize=2;
		empList.stream().sorted((e1, e2) -> e2.getDoj().compareTo(e1.getDoj())).limit(limitSize)
				.forEach(System.out::println);

		// find the average sal of all emps?
		Optional<Double> optTotalSal = empList.stream().map((e) -> e.getSalary()).reduce((o1, o2) -> o1 + o2);
		if (optTotalSal.isPresent()) {
			System.out.println("Avg sal:" + optTotalSal.get() / empList.size());
		} else {

		}

	}

}
