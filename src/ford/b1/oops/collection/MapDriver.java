package ford.b1.oops.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDriver {

	public static void main(String[] args) {
		
		// Create
		Map<Integer,String> nameMap =  new HashMap<>();
		nameMap.put(1, "aa");
		nameMap.put(5, "dd");
		nameMap.put(9, null);
		nameMap.put(11, null);
		nameMap.put(null, "zz");
		nameMap.put(null, "jj");
		nameMap.put(9, "ff");
		System.out.println(nameMap);
		//Read
		System.out.println("kay 1:value?"+nameMap.get(1));
		System.out.println("kay 2:value?"+nameMap.get(2));
		System.out.println("contain key 5?"+nameMap.containsKey(5));
		System.out.println("contain value aa?"+nameMap.containsValue("aa"));
		System.out.println("contain value ee?"+nameMap.containsValue("ee"));
		//update
		nameMap.replace(1, "bb");
		System.out.println(nameMap);
		System.out.println("replace old value of 5?:"+nameMap.replace(5, "11","ee"));
		System.out.println(nameMap);
		System.out.println("replace old value of 5?:"+nameMap.replace(5, "dd","ee"));
		System.out.println(nameMap);
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "n1", 100.0));
		employeeList.add(new Employee(4, "n4", 400.0));
		employeeList.add(new Employee(8, "n8", 800.0));
		employeeList.add(new Employee(8, "n8", 800.0));
		
		// create
		Map<Integer,Employee> empMap = new HashMap<>();
		empMap.put(1, new Employee(1, "n1", 100.0));
		empMap.put(4, new Employee(4, "n4", 400.0));
		empMap.put(8, new Employee(8, "n8", 800.0));
		System.out.println(empMap);
		//read
		System.out.println(empMap.get(8));
		//update
		empMap.replace(4, new Employee(4, "new name4", 450.0));
		System.out.println(empMap);
		//delete
		empMap.remove(8);
		System.out.println(empMap);
		
	}

}
