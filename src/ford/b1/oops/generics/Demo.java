package ford.b1.oops.generics;

public class Demo {
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
