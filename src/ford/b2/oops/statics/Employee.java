package ford.b2.oops.statics;

public class Employee {

	public static String name = "Ford"; // static data member
	public String email = "info@ford.com";// instance data member

	private static Integer data = 100;

	public void dispData() {
		System.out.println("data:"+data);
	}
	public void setData(int data) {
		Employee.data = data;
	}

	public Integer getData() {
		return data;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Employee.name = name;
	}

	public void display() {
		System.out.println(name);
		System.out.println(email);
		display2();
	}

	public static void display2() {
		System.out.println(name);
		// System.out.println(email);
		// display();
	}

}
