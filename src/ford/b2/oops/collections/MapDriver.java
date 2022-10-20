package ford.b2.oops.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDriver {

	public static void main(String[] args) {

		//HashMap features
		//1. No order
		//2. No duplicate keys
		//3. Not sorted
		
		// Create
		Map<Integer,String> nameNamp = new HashMap<>();
		nameNamp.put(2, "dd");
		nameNamp.put(5, "gg");
		nameNamp.put(-9, "jj");
		nameNamp.put(4, "ee");
		System.out.println(nameNamp);
		nameNamp.put(4, "ZZ");
		System.out.println(nameNamp);
		nameNamp.put(null, "yy");
		System.out.println(nameNamp);
		nameNamp.put(22, null);
		nameNamp.put(44, null);
		System.out.println(nameNamp);
		//Read
		System.out.println("find key 5="+nameNamp.get(5));
		System.out.println("find key 55="+nameNamp.get(55));
		nameNamp.put(55, null);
		System.out.println(nameNamp);
		System.out.println("contains key 55:"+nameNamp.containsKey(55));
		// Update
		nameNamp.put(56, "kk");
		nameNamp.replace(55, "kk");
		System.out.println(nameNamp);
		//delete
		nameNamp.remove(-9);
		System.out.println(nameNamp);
		// C
		Map<Integer,Employee> empMap = new HashMap<>();
		empMap.put(1, new Employee(1, "n1", 100.0));
		empMap.put(2, new Employee(2, "n2", 200.0));
		empMap.put(5, new Employee(5, "n2", 500.0));
		System.out.println(empMap);
		//R
		System.out.println(empMap.get(5));
		//update
		System.out.println(empMap.replace(5,  new Employee(5, "new 5", 550.0)));
		System.out.println(empMap);
		//D
		empMap.remove(5);
		System.out.println(empMap);
	}

}
