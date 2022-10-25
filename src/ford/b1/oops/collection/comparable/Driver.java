package ford.b1.oops.collection.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "BB", 300.0));
		empList.add(new Employee(5, "EE", 150.0));
		empList.add(new Employee(2, "DD", 500.0));
		empList.add(new Employee(3, "AA", 200.0));
		System.out.println("Before sort:");
		System.out.println(empList);
		Collections.sort(empList);
		System.out.println("After sort by id:");
		System.out.println(empList);
		
		empList.sort(new EmployeeNameComparator());
		System.out.println("Emp by name:");
		System.out.println(empList);
		
		empList.sort(new EmployeeSalaryComparator());
		System.out.println("Emp by salary:");
		System.out.println(empList);
		
		empList.sort(new EmployeeSalaryComparator());
		System.out.println("Emp by salary:");
		System.out.println(empList);
		
		//Task to create comparator with parameters to sort.
		
		empList.sort(new EmployeeComparator(2));
		System.out.println("Emp by salary:");
		System.out.println(empList);
		empList.sort(new EmployeeComparator(0));
		System.out.println("Emp by Id:");
		System.out.println(empList);
		empList.sort(new EmployeeComparator(1));
		System.out.println("Emp by name:");
		System.out.println(empList);
		
		Map<Integer,Employee> empMap = new HashMap<>();
		// convert emp list to map
		for(Employee emp:empList) {
			empMap.put(emp.getId(), emp);
		}
		System.out.println(empMap);
		System.out.println("New emp list from Map");
		empMap.put(6, new Employee(6, "ÿy", 550.0));
		Collection<Employee> newEmpList = empMap.values();
		System.out.println(newEmpList);	
		// sorting in descending order
		System.out.println("Emp by sal in Desc order");
		Collections.sort(empList, Collections.reverseOrder(new EmployeeSalaryComparator()));
		System.out.println(empList);
	}

}
