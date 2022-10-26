package ford.b1.oops.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDriver {

	public static void main(String[] args) {

		// Map
		List<String> namesList = new ArrayList<>();
		namesList.add("Supriya");
		namesList.add("Abhijith");
		namesList.add("Akshat");
		namesList.add("Aravinth");
		namesList.add("Hari");
		namesList.add("Pavan");
		// to find lenth of each name?
		namesList.stream().map((name) -> name.length()).forEach((len) -> System.out.println(len));
		// print all names in upper case?
		namesList.stream().map((name) -> name.toUpperCase()).forEach((upperName) -> System.out.println(upperName));
		// collect the processed data
		List<String> upperCaseNamesList = namesList.stream().map((name) -> name.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("uppecase names:" + upperCaseNamesList);

		// find all the names having length >=6
		namesList.stream().filter((name) -> name.length() >= 6).forEach((name) -> System.out.println(name));
		// print name length less than 6 chars
		namesList.stream().map((n) -> n.length()).filter((l) -> l < 6).forEach((l) -> System.out.println(l));

		// to find lenth of each name and sum it
		Optional<Integer> optTotalLength = namesList.stream().map((name) -> name.length()).reduce((a, b) -> a + b);
		if(optTotalLength.isPresent())
			System.out.println(optTotalLength.get());
		
		// print all e names in sorted order.
		namesList.stream().sorted((n1,n2)->n1.compareTo(n2)).forEach((n) -> System.out.println(n));
		System.out.println(namesList);

	}

}
