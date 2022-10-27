package ford.b1.oops.generics;

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
	@Override
	public String toString() {
		return "DemoGeneric [data=" + data + "]";
	}
	

}
