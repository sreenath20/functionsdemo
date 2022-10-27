package ford.b2.oops.generics;

public class Demo { // class / data type handle perticular Integer data

	private Integer data;

	public Demo() {
		super();
	}

	public Demo(Integer data) {
		super();
		this.data = data;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Demo [data=" + data + "]";
	}
	
}
