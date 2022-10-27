package ford.b2.oops.generics;

import java.util.List;

public class DemoGeneric<T> {

	// Generic type
	private T data;

	public DemoGeneric() {
		super();
	}

	public DemoGeneric(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
// Generic method
	// accept any data type of list
//	public static void display(List<?> data) {
//	
//		
//	}
//	
	// Setting upper bound to parameter type using extends
	public static void display(List<? extends B> data) {
	
		
	}
	// Setting lower bound to parameter type using extends
	public static void display2(List<? super B> data) {
	
		
	}
	
	@Override
	public String toString() {
		return "DemoGeneric [data=" + data + "]";
	}
	
}
