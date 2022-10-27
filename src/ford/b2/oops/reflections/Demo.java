package ford.b2.oops.reflections;

public class Demo {
	private String name;

	public Demo() {
		super();
	}

	public Demo(String name) {
		super();
		this.name = name;
	}

	public void fun1() {
		System.out.println("name:"+name);
	}

	public void fun2(int data) {
		System.out.println("data:"+data);
	}
	private void fun3() {
		System.out.println("Private method");
	}

}
