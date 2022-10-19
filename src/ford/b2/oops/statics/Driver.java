package ford.b2.oops.statics;

public class Driver {

	public static void main(String[] args) {
		
		Employee.display2();
		//Employee.name="new ford";
		Employee.setName("new Name");
		Employee.display2();
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.dispData();
		emp2.dispData();
		emp1.setData(250);
		System.out.println(emp2.getData());
		
	}

}
