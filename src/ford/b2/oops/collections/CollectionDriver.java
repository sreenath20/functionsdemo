package ford.b2.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDriver {

	public static void main(String[] args) {
		//Features of List
		//1.In Order
		//2.Not sorted 
		//3. Duplicates
		
		// Create
		List<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(14);
		intList.add(11);
		intList.add(-11);
		intList.add(2);
		
		System.out.println(intList);
		System.out.println(intList.size());
	
		//Read
		System.out.println("element at index 3:"+intList.get(3));
		System.out.println("index of 14:"+intList.indexOf(14));
		for(int index=0;index<intList.size();index++) {
			System.out.println(intList.get(index));
		}
		System.out.println("Using for each:");
		for(Integer data:intList) {
			System.out.println(data);
		}
		//Update
		intList.add(1, 7);
		System.out.println(intList);
		//intList.add(2, 15);
		System.out.println("replace 14 at index 2:"+intList.set(2, 15));
		System.out.println(intList);
		
		//Delete
		System.out.println("remove element at index 4:"+intList.remove(4));
		System.out.println(intList);
		Integer deldata=15;
		System.out.println("remove element 15:"+intList.remove(deldata));
		System.out.println(intList);
		
		Integer deldata2=16;
		System.out.println("remove element 16:"+intList.remove(deldata2));
		System.out.println(intList);
		intList.clear();
		System.out.println("clear:"+intList);
		System.out.println("is empty:"+intList.isEmpty());
		// concatination of list
		List<Integer> intList2 = new ArrayList<>();
		intList2.add(1);
		intList2.add(2);
		intList2.add(3);
		intList.addAll(intList2);
		System.out.println("list1=list1+list2"+intList);
		intList.addAll(1, intList2);
		System.out.println("list1="+intList);
		System.out.println("list2="+intList2);
		System.out.println("l1 contains 5:"+intList.contains(5));
		System.out.println("l1 contains all l2:"+intList.containsAll(intList2));
		intList2.add(9);
		System.out.println("list1="+intList);
		System.out.println("list2="+intList2);
		System.out.println("l1 contains all l2:"+intList.containsAll(intList2));
		System.out.println("l1 hash code:"+intList.hashCode());
		System.out.println("l1 hash code:"+intList.hashCode());
		System.out.println("l2 hash code:"+intList2.hashCode());
		List<Integer> tempList = intList;
		System.out.println("tempList hash code:"+tempList.hashCode());
		System.out.println("remove all l1 from l2:"+intList2.removeAll(intList));
		System.out.println("l2:"+intList2);
		
		System.out.println("list1="+intList);
		System.out.println("list2="+intList2);
		
		System.out.println("remove all l1 from l2:"+intList2.removeAll(intList));
		System.out.println("l2:"+intList2);
		//retain all
		intList2.add(2);

		System.out.println("list1="+intList);
		System.out.println("list2="+intList2);
		System.out.println("remove all l1 from l2:"+intList.retainAll(intList2));
		System.out.println("l1:"+intList);
		
		// sort
		Collections.sort(intList2);
		System.out.println("after sort:"+intList2);
		
		List<String> stringList=new ArrayList<>();
		List<Double> doubleList=new ArrayList<>();
		// list of user defined data
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "n1", 100.0));
		employeeList.add(new Employee(5, "n5", 500.0));
		System.out.println(employeeList);
		System.out.println("emp at index 1:"+employeeList.get(1));
		employeeList.add(1,new Employee(3, "n3", 300.0));
		System.out.println(employeeList);
		employeeList.set(0, new Employee(11, "n11", 1100.0));
		System.out.println(employeeList);
		//update id 3 name = "new name"
		for(Employee emp:employeeList) {
			if(emp.getId()==3) {
				emp.setName("new name");
				break;
			}
		}
		System.out.println(employeeList);
		employeeList.remove(1);
		System.out.println(employeeList);
		
		Employee findEmp = new Employee(5, "n5", 500.0);
		employeeList.add(new Employee(2, "n2", 200.0));
		System.out.println(employeeList);
		System.out.println("emp id 11 found :"+employeeList.indexOf(findEmp));
		employeeList.remove(findEmp);
		System.out.println(employeeList);
		//Collections.sort(employeeList);
		
		
	}

}
