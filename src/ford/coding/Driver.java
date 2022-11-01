package ford.coding;

public class Driver {

	public static void main(String[] args) {
		Address add = new Address(455, "Main street", "Delhi");
		Employee emp = new Employee(1, "ford", add);
		System.out.println(emp);

	}

}
