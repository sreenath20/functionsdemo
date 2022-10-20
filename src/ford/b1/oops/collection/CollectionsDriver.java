package ford.b1.oops.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDriver {

	public static void main(String[] args) {
		// 1. same order
		// 2. not sorted
		// 3. allows duplicates

		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(3);
		intList.add(0);
		intList.add(3);
		System.out.println(intList);
		intList.add(0, 1);
		System.out.println(intList);
		intList.add(1, 2);
		System.out.println(intList);
		System.out.println("contains 5:" + intList.contains(5));
		System.out.println("contains 6:" + intList.contains(6));
		System.out.println("Element at index 2:" + intList.get(2));
		System.out.println("List size:" + intList.size());
		// System.out.println("Element at index 2:"+ intList.get(6));
		System.out.println("Hash code:" + intList.hashCode());
		System.out.println("first occurance index of 3:" + intList.indexOf(3));
		System.out.println("last occurance index of 3:" + intList.lastIndexOf(3));
		// intList.clear();
		System.out.println("is empty:" + intList.isEmpty());
		System.out.println("remove element at index 2:" + intList.remove(2));
		System.out.println("after remove :" + intList);
		Integer data = 2;
		System.out.println("remove element at index 2:" + intList.remove(data));
		System.out.println("after remove :" + intList);

		System.out.println("replace index 1 with 2: " + intList.set(1, data));
		System.out.println("After replace:" + intList);
		System.out.println("sublist 1:3=" + intList.subList(1, 3));

		List<Integer> intList1 = new ArrayList<>();
		intList1.add(1);
		intList1.add(2);
		intList1.add(3);
		intList1.add(4);

		List<Integer> intList2 = new ArrayList<>(intList1);
		System.out.println("List 1:" + intList1);
		System.out.println("List 2:" + intList2);
		System.out.println("l1 contains all elements of L2?:" + intList1.containsAll(intList2));
		intList2.add(5);
		System.out.println("l1 contains all elements of L2?:" + intList1.containsAll(intList2));
		System.out.println("List 1:" + intList1);
		System.out.println("List 2:" + intList2);
		System.out.println("Remove All:" + intList2.removeAll(intList1));
		System.out.println("after remove all:" + intList2);
		intList2.add(3);
		intList2.add(1);
		System.out.println("List 1:" + intList1);
		System.out.println("List 2:" + intList2);
		System.out.println("Retain All:" + intList1.retainAll(intList2));
		System.out.println("after retain all:" + intList1);

		List<Double> doubleList = new ArrayList<>();
		List<String> names = new ArrayList<>();
		System.out.println("List2:" + intList2);
		Collections.sort(intList2);
		System.out.println("After sort:" + intList2);

		System.out.println("List 1:" + intList1);
		System.out.println("List 2:" + intList2);
		intList1.addAll(intList2);
		System.out.println("After adding all:" + intList1);
		intList1.clear();
		intList1.add(1);
		intList1.add(2);
		intList1.add(3);
		intList1.add(4);
		System.out.println("List 1:" + intList1);
		System.out.println("List 2:" + intList2);
		intList1.addAll(2, intList2);
		System.out.println("List 1:" + intList1);

		// Create
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "n1", 100.0));
		employeeList.add(new Employee(4, "n4", 400.0));
		employeeList.add(new Employee(8, "n8", 800.0));
		System.out.println(employeeList);
		// Read
		System.out.println("emp at index 2:" + employeeList.get(2));
		for (int index = 0; index < employeeList.size(); index++) {
			System.out.println(employeeList.get(index));
		}
		System.out.println("using for each");
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}
		Employee findEmp = new Employee(2, "n2", 200.0);
		System.out.println("id 2 exists?:" + employeeList.indexOf(findEmp));
		Employee findEmp2 = new Employee(8, "n8", 800.0);
		System.out.println("id 8 exists?:" + employeeList.indexOf(findEmp2));
		// Update
		Employee updateEmp = new Employee(8, "new n8", 850.0);
		employeeList.set(2, updateEmp);
		System.out.println("updated list:" + employeeList);
		// update id 4 name to "new name"
		for (Employee emp : employeeList) {
			if (emp.getId() == 4) {
				emp.setName("new name");
			}
		}
		System.out.println("update emp id 4 name:" + employeeList);
		// Delete
		Employee deleteEmp = new Employee(8, "new n8", 850.0);
		Integer delIndex = employeeList.indexOf(deleteEmp);
		if (delIndex >= 0) {
			System.out.println("delete id 8" + employeeList.remove(delIndex.intValue()));
			System.out.println("emp list:"+employeeList);
		}
		Employee deleteEmp2 = new Employee(1, "n1", 100.0);
		employeeList.remove(deleteEmp2);
		System.out.println("After removing emp 1"+employeeList);
	}

}
