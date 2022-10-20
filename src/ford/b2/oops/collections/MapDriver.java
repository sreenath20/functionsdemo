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
		System.out.println(nameNamp);
	}

}
