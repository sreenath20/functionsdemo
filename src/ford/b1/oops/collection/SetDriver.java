package ford.b1.oops.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDriver {

	public static void main(String[] args) {
		//Set fetures
		//1.not in order
		//2. not sorted
		//3. no duplicates
		
		
		Set<Integer> intSet = new HashSet<>();
		intSet.add(5);
		intSet.add(5);
		intSet.add(1);
		intSet.add(-11);
		System.out.println(intSet);
		
		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Employee(1, "n1", 100.0));
		empSet.add(new Employee(9, "n9", 900.0));
		empSet.add(new Employee(2, "n2", 200.0));
		// add duplicate
		empSet.add(new Employee(2, "n2", 200.0));
		System.out.println(empSet);
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "n1", 100.0));
		employeeList.add(new Employee(4, "n4", 400.0));
		employeeList.add(new Employee(8, "n8", 800.0));
		employeeList.add(new Employee(8, "n8", 800.0));
		System.out.println(employeeList);
		Set<Employee> newEmployeeSet = new HashSet<>(employeeList);// removes duplicates if any .
		System.out.println(newEmployeeSet);
		
		
	}

}
