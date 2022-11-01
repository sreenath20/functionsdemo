package ford.b2.oops.stream.parallel;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Moulika");
		nameList.add("Chandana");
		nameList.add("Abinaya");
		nameList.add("Iswarya");
		nameList.add("Kamal");
		nameList.add("Giri");
		nameList.add("Phanindra");

		nameList.stream().map((s)->s.length()).forEach((n)->System.out.println(n+" "+Thread.currentThread().getName()));
		System.out.println("parallelStream");
		nameList.parallelStream().map((s)->s.length()).forEach((n)->System.out.println(n+" "+Thread.currentThread().getName()));
		System.out.println("stream().parallel()");
		nameList.stream().map((s)->s.length()).parallel().forEach((n)->System.out.println(n+" "+Thread.currentThread().getName()));
	}

}
