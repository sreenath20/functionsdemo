package ford.b1.oops.generics;

import java.util.List;

public class DemoGeneric<T> {

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

	// setting upper bounds of generic parametersto methods.

	public static Double sum(List<? extends Number> list) {

		Double sum = 0.0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}

//	public static void display(List<?> list) {
//
//		for (Object n : list) {
//			System.out.println(n + " ");
//		}
//
//	}
	// setting lower bound of parameters to Integer : A->B->C
	public static void display(List<? extends B> list) {

		for (Object n : list) {
			System.out.println(n + " ");
		}

	}
	public static void display2(List<? super B> list) {

		for (Object n : list) {
			System.out.println(n + " ");
		}

	}
	@Override
	public String toString() {
		return "DemoGeneric [data=" + data + "]";
	}

}
