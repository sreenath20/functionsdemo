package ford.b2.oops.generics;

import java.util.List;

public interface GenericDemoInterface<T> {

	void display(T data);
	void display(List<T> data);
}
