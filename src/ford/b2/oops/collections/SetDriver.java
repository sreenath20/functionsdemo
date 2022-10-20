package ford.b2.oops.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDriver {

	public static void main(String[] args) {
		// features of Set
		// 1. not in order
		// 2. not sorted
		// 3.
		Set<Integer> intSet = new HashSet<>();
		intSet.add(4);
		intSet.add(8);
		intSet.add(-8);
		System.out.println("Add 4:" + intSet.add(4));
		System.out.println(intSet);
		// Create
		List<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(14);
		intList.add(11);
		intList.add(-11);
		intList.add(2);
		System.out.println("List:" + intList);
		Set<Integer> intNewSet = new HashSet<>(intList);
		System.out.println(intNewSet);
		Set<Employee> employeeSet = new HashSet<>();
		employeeSet.add(new Employee(1, "n1", 100.0));
		employeeSet.add(new Employee(-6, "n6", 600.0));
		employeeSet.add(new Employee(3, "n3", 300.0));
		System.out.println("Add emp id 3:" + employeeSet.add(new Employee(3, "n3", 300.0)));
		System.out.println(employeeSet);
		
		Set<Integer> intSet2 = new LinkedHashSet<>();
		intSet2.add(1);
		intSet2.add(3);
		intSet2.add(2);
		System.out.println("Add 4:" + intSet2.add(4));
		System.out.println(intSet2);
		
		Set<Integer> intSet3 = new TreeSet<>();
		intSet3.add(1);
		intSet3.add(3);
		intSet3.add(2);
		System.out.println("Add 4:" + intSet3.add(4));
		System.out.println(intSet3);

	}

}
