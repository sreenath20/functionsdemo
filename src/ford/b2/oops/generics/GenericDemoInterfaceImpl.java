package ford.b2.oops.generics;

import java.util.List;

public class GenericDemoInterfaceImpl<T> implements GenericDemoInterface<T> {

	// generic method
	@Override
	public void display(T data) {

		System.out.println(data);

	}
	@Override
	public void display(List<T> list) {

		for (T ref : list) {
			System.out.println(ref);
		}
	}
}
