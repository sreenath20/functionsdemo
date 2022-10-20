package ford.b1.oops.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDriver {

	public static void main(String[] args) {
		//1. same order
		//2. not sorted
		//3. allows duplicates
		
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
		System.out.println("contains 5:"+intList.contains(5));
		System.out.println("contains 6:"+intList.contains(6));
		System.out.println("Element at index 2:"+ intList.get(2));
		System.out.println("List size:"+intList.size());
		//System.out.println("Element at index 2:"+ intList.get(6));
		System.out.println("Hash code:"+intList.hashCode());
		System.out.println("first occurance index of 3:"+intList.indexOf(3));
		System.out.println("last occurance index of 3:"+intList.lastIndexOf(3));
		//intList.clear();
		System.out.println("is empty:"+intList.isEmpty());
		System.out.println("remove element at index 2:"+intList.remove(2));
		System.out.println("after remove :"+intList);
		Integer data=2;
		System.out.println("remove element at index 2:"+intList.remove(data));
		System.out.println("after remove :"+intList);
		
		System.out.println("replace index 1 with 2: "+intList.set(1, data));
		System.out.println("After replace:"+intList);
		System.out.println("sublist 1:3="+intList.subList(1, 3));
		
		List<Integer> intList1 = new ArrayList<>();
		intList1.add(1);
		intList1.add(2);
		intList1.add(3);
		intList1.add(4);
		
		List<Integer> intList2 = new ArrayList<>(intList1);
		System.out.println("List 1:"+intList1);
		System.out.println("List 2:"+intList2);
		System.out.println("l1 contains all elements of L2?:"+intList1.containsAll(intList2));
		intList2.add(5);
		System.out.println("l1 contains all elements of L2?:"+intList1.containsAll(intList2));
		System.out.println("List 1:"+intList1);
		System.out.println("List 2:"+intList2);
		System.out.println("Remove All:"+intList2.removeAll(intList1));
		System.out.println("after remove all:"+intList2);
		intList2.add(3);
		intList2.add(1);
		System.out.println("List 1:"+intList1);
		System.out.println("List 2:"+intList2);
		System.out.println("Retain All:"+intList1.retainAll(intList2));
		System.out.println("after retain all:"+intList1);
		
		List<Double> doubleList = new ArrayList<>();
		List<String> names=new ArrayList<>();
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "n1", 100.0));
		employeeList.add(new Employee(4, "n4", 400.0));
		employeeList.add(new Employee(8, "n8", 800.0));
		System.out.println(employeeList);
		
		
		
	}

}
