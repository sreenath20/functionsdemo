package ford.b2.oops.collections.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1, "BB", 300.0));
		empList.add(new Employee(5, "EE", 150.0));
		empList.add(new Employee(2, "DD", 500.0));
		empList.add(new Employee(3, "AA", 200.0));

		System.out.println(empList);

		//Ascending order
		Collections.sort(empList);
		
		System.out.println(empList);

		// Descending order
		empList.sort(Collections.reverseOrder());
		System.out.println(empList);
		
		// sort by name in ASC
		empList.sort(new EmployeeNameComparator());
		System.out.println(empList);
		// sort by name in DESC
		empList.sort(Collections.reverseOrder(new EmployeeNameComparator()));
		System.out.println(empList);
		// convert list to map
		Map<Integer,Employee> empMap = new HashMap<>();
		
		for(Employee emp:empList) {
			empMap.put(emp.getId(), emp);
			
		}
		System.out.println(empMap);
		// convert map to list
		Set<Integer> keySet=empMap.keySet();
		System.out.println(keySet);
		Collection<Employee> newEmpList = empMap.values();
		System.out.println(newEmpList);
		
		
	}

}
