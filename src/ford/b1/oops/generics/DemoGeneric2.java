package ford.b1.oops.generics;

public class DemoGeneric2<T,V> {

	private T data;

	public DemoGeneric2() {
		super();
	}
	public DemoGeneric2(T data) {
		super();
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "DemoGeneric [data=" + data + "]";
	}
	

}
